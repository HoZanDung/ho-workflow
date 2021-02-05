package cn.com.ho.workflow.cmd;


import cn.com.ho.workflow.diagram.Node;
import cn.com.ho.workflow.domain.entities.bpm.*;
import cn.com.ho.workflow.domain.enums.CreateUpdateByEnum;
import cn.com.ho.workflow.infrastructure.actRepository.ActReModelRepository;
import cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel;
import cn.com.ho.workflow.infrastructure.repositories.bpm.*;
import cn.com.ho.workflow.util.IdWorker;
import com.fasterxml.jackson.databind.JsonNode;
import org.activiti.bpmn.model.Process;
import org.activiti.bpmn.model.*;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 把xml解析的内存模型保存到数据库里.
 */
public class SyncProcessCmd implements Command<Void> {

    /**
     * 流程定义key.
     */
    private String modelId;

    private BpmnModel bpmnModel;

    private JsonNode modelNode;

    private ActReModelRepository actReModelRepository;

    private BpmConfNodeRepository bpmConfNodeRepository;

    private BpmConfUserRepository bpmConfUserRepository;

    private BpmConfFormRepository bpmConfFormRepository;

    private BpmConfListenerRepository bpmConfListenerRepository;

    private BpmConfCountersignRepository bpmConfCountersignRepository;

    private final static String Auto = CreateUpdateByEnum.AUTO.getText();

    /**
     * 构造方法.
     */
    public SyncProcessCmd(String modelId, BpmnModel bpmnModel, JsonNode modelNode,
                          ActReModelRepository actReModelRepository, BpmConfNodeRepository bpmConfNodeRepository,
                          BpmConfUserRepository bpmConfUserRepository, BpmConfFormRepository bpmConfFormRepository,
                          BpmConfListenerRepository bpmConfListenerRepository, BpmConfCountersignRepository bpmConfCountersignRepository) {
        this.modelId = modelId;
        this.bpmnModel = bpmnModel;
        this.modelNode = modelNode;
        this.actReModelRepository = actReModelRepository;
        this.bpmConfNodeRepository = bpmConfNodeRepository;
        this.bpmConfUserRepository = bpmConfUserRepository;
        this.bpmConfFormRepository = bpmConfFormRepository;
        this.bpmConfListenerRepository = bpmConfListenerRepository;
        this.bpmConfCountersignRepository = bpmConfCountersignRepository;
    }

    @Override
    public Void execute(CommandContext commandContext) {
        ActReModel actReModel = actReModelRepository.findOneByActReModelId(modelId);
        //  处理全局节点
        this.processGlobal(bpmnModel, actReModel);

        int priority = 2;
        List<JsonNode> jsonNodeList = modelNode.findParents("resourceId");
        for (JsonNode jsonNode : jsonNodeList) {
            String nodeType;
            boolean stencil = jsonNode.has("stencil");
            if (stencil) {
                nodeType = jsonNode.findValue("stencil").findValue("id").asText();
                //  属于任务/开始/结束/网关等类型才操作
                if (StringUtils.equals(nodeType, "ExclusiveGateway") || StringUtils.equals(nodeType, "UserTask") || StringUtils.equals(nodeType, "ManualTask") ||
                        StringUtils.equals(nodeType, "StartNoneEvent") || StringUtils.equals(nodeType, "EndNoneEvent")) {
                    //  解析xml获取属性
                    String nodeId = jsonNode.findValue("properties").findValue("overrideid").asText();
                    String nodeName = jsonNode.findValue("properties").findValue("name") == null ? nodeId : jsonNode.findValue("properties").findValue("name").asText();

                    //  解析出来实例化一个节点
                    Node node = new Node();
                    node.setId(nodeId);
                    node.setType(nodeType);
                    node.setName(nodeName);

                    //  任务
                    if (StringUtils.equals(nodeType, "UserTask") || StringUtils.equals(nodeType, "ManualTask")) {
                        this.processUserTask(node, bpmnModel, priority++, actReModel);
                    }

                    //  开始
                    if (StringUtils.equals(nodeType, "StartNoneEvent")) {
                        this.processStartEvent(node, bpmnModel, priority++, actReModel);
                    }

                    //  结束
                    if (StringUtils.equals(nodeType, "EndNoneEvent")) {
                        this.processEndEvent(node, bpmnModel, priority++, actReModel);
                    }
                }
            }
        }
        updateBpmConfNodeCount(modelId);
        return null;
    }

    private void updateBpmConfNodeCount(String modelId) {
        List<BpmConfNode> bpmConfNodes = bpmConfNodeRepository.selectByConfBaseId(modelId);
        for (BpmConfNode bpmConfNode : bpmConfNodes) {
            String nodeId = bpmConfNode.getId();

            bpmConfNode.setConfUser(bpmConfUserRepository.countByNodeId(nodeId));
            bpmConfNode.setConfListener(bpmConfListenerRepository.countByNodeId(nodeId));
            bpmConfNode.setConfForm(bpmConfFormRepository.countByNodeId(nodeId));

            bpmConfNode.setConfRule(0);
            bpmConfNode.setConfOperation(0);
            bpmConfNode.setConfNotice(0);
            bpmConfNodeRepository.updateBpmConfNode(bpmConfNode);
        }
    }

    /**
     * 全局配置.
     */
    private void processGlobal(BpmnModel bpmnModel, ActReModel actReModel) {
        Process process = bpmnModel.getMainProcess();
        BpmConfNode bpmConfNode = this.handleBpmConfNode(process.getId(), "全局", "process", 1, actReModel);

        // 配置监听器
        bpmConfListenerRepository.deleteByNodeIdAndCreateBy(bpmConfNode.getId(), Auto);
        this.processListener(process.getExecutionListeners(), bpmConfNode);
    }

    /**
     * 配置用户任务.
     */
    private void processUserTask(Node node, BpmnModel bpmnModel, int priority, ActReModel actReModel) {
        //  先处理图像节点
        BpmConfNode bpmConfNode = this.handleBpmConfNode(node.getId(), node.getName(), node.getType(), priority, actReModel);

        //  节点强转为用户任务节点,才能用到对应的属性
        UserTask userTask = (UserTask) bpmnModel.getFlowElement(node.getId());
        String bpmConfNodeId = bpmConfNode.getId();

        // 配置参与者,以最新为准
        bpmConfUserRepository.deleteByNodeIdAndCreateBy(bpmConfNodeId, Auto);
        int index = 1;
        index = this.processUserTaskConf(bpmConfNode, userTask.getAssignee(), "0", index);
        for (String candidateUser : userTask.getCandidateUsers()) {
            index = this.processUserTaskConf(bpmConfNode, candidateUser, "1", index);
        }
        for (String candidateGroup : userTask.getCandidateGroups()) {
            this.processUserTaskConf(bpmConfNode, candidateGroup, "2", index);
        }

        // 配置监听器,以最新为准
        bpmConfListenerRepository.deleteByNodeIdAndCreateBy(bpmConfNodeId, Auto);
        this.processListener(userTask.getExecutionListeners(), bpmConfNode);
        this.processListener(userTask.getTaskListeners(), bpmConfNode);

        // 配置表单,以最新为准
        bpmConfFormRepository.deleteByNodeIdAndCreateBy(bpmConfNodeId, Auto);
        this.processForm(userTask, bpmConfNode);

        // 会签只在图做标示,因此没有另外维护选项,无需区分图和额外维护的数据
        if (userTask.getLoopCharacteristics() != null) {
            //  每次都先把这个节点对应的会签先删掉
            bpmConfCountersignRepository.deleteByNodeId(bpmConfNodeId);
            BpmConfCountersign bpmConfCountersign = new BpmConfCountersign();

            bpmConfCountersign.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfCountersign.setType("all");//    会签类型 all：全票通过 percent：比例通过
            bpmConfCountersign.setRate(100);
            bpmConfCountersign.setNodeId(bpmConfNodeId);
            bpmConfCountersign.setParticipant(userTask.getLoopCharacteristics().getLoopCardinality());
            if (userTask.getLoopCharacteristics().isSequential()) {
                bpmConfCountersign.setSequential("sequential");
            } else {
                bpmConfCountersign.setSequential("parallel");
            }
            bpmConfCountersign.setStatus("1");
            bpmConfCountersign.setProcessModelId(modelId);
            bpmConfCountersignRepository.insertBpmConfCountersign(bpmConfCountersign);
        }
    }

    /**
     * 配置参与者.
     */
    public int processUserTaskConf(BpmConfNode bpmConfNode, String value, String type, int priority) {
        if (value == null) {
            return priority;
        }

        LocalDateTime now = LocalDateTime.now();

        String nodeId = bpmConfNode.getId();
        String nodeCode = bpmConfNode.getCode();
        String nodeName = bpmConfNode.getName();

        //  一切以最新的图为准
        BpmConfUser bpmConfUser = new BpmConfUser();

        bpmConfUser.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
        bpmConfUser.setValue(value);
        bpmConfUser.setType(type);
        bpmConfUser.setStatus("1");
        bpmConfUser.setPriority(priority);

        //  流程节点相关信息
        bpmConfUser.setNodeId(nodeId);
        bpmConfUser.setNodeCode(nodeCode);
        bpmConfUser.setNodeName(nodeName);
        bpmConfUser.setProcessModelId(this.modelId);

        //  基础信息
        bpmConfUser.setCreateTime(now);
        bpmConfUser.setUpdateTime(now);
        bpmConfUser.setCreateBy(Auto);
        bpmConfUser.setUpdateBy(Auto);
        bpmConfUserRepository.insertBpmConfUser(bpmConfUser);

        return priority + 1;
    }

    /**
     * 配置开始事件.
     */
    private void processStartEvent(Node node, BpmnModel bpmnModel, int priority, ActReModel actReModel) {
        this.handleStartEndEvent(node, bpmnModel, priority, actReModel, true);
    }

    /**
     * 配置结束事件.
     */
    private void processEndEvent(Node node, BpmnModel bpmnModel, int priority, ActReModel actReModel) {
        this.handleStartEndEvent(node, bpmnModel, priority, actReModel, false);
    }

    private void handleStartEndEvent(Node node, BpmnModel bpmnModel, int priority, ActReModel actReModel, boolean isStartEvent) {
        BpmConfNode bpmConfNode = handleBpmConfNode(node.getId(), node.getName(), node.getType(), priority, actReModel);

        FlowElement flowElement = bpmnModel.getFlowElement(node.getId());
        String bpmConfNodeId = bpmConfNode.getId();

        // 配置监听器,以最新为准
        bpmConfListenerRepository.deleteByNodeIdAndCreateBy(bpmConfNodeId, Auto);
        this.processListener(flowElement.getExecutionListeners(), bpmConfNode);

        //  开始节点配置表单
        if (isStartEvent) {
            StartEvent startEvent = (StartEvent) flowElement;
            // 配置表单,以最新为准
            bpmConfFormRepository.deleteByNodeIdAndCreateBy(bpmConfNodeId, Auto);
            this.processForm(startEvent, bpmConfNode);
        }
    }

    /**
     * 配置监听器.
     */
    private void processListener(List<ActivitiListener> activityListeners, BpmConfNode bpmConfNode) {
        for (ActivitiListener activitiListener : activityListeners) {
            String value = activitiListener.getImplementation();
            String type = activitiListener.getEvent();

            String nodeId = bpmConfNode.getId();
            String nodeCode = bpmConfNode.getCode();
            String nodeName = bpmConfNode.getName();

            LocalDateTime now = LocalDateTime.now();

            BpmConfListener bpmConfListener = new BpmConfListener();

            bpmConfListener.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfListener.setValue(value);
            bpmConfListener.setStatus("1");
            bpmConfListener.setType(type);
            bpmConfListener.setExtStatus("1");
            bpmConfListener.setProcessModelId(modelId);

            bpmConfListener.setNodeId(nodeId);
            bpmConfListener.setNodeCode(nodeCode);
            bpmConfListener.setNodeName(nodeName);

            bpmConfListener.setCreateTime(now);
            bpmConfListener.setUpdateTime(now);
            bpmConfListener.setCreateBy(Auto);
            bpmConfListener.setUpdateBy(Auto);
            bpmConfListenerRepository.insertBpmConfListener(bpmConfListener);
        }
    }

    /**
     * 配置表单，userTask.
     */
    private void processForm(UserTask userTask, BpmConfNode bpmConfNode) {
        if (userTask.getFormKey() == null) {
            return;
        }
        this.handleForm(userTask.getFormKey(), bpmConfNode);
    }

    /**
     * 配置表单，startEvent.
     */
    private void processForm(StartEvent startEvent, BpmConfNode bpmConfNode) {
        if (startEvent.getFormKey() == null) {
            return;
        }
        this.handleForm(startEvent.getFormKey(), bpmConfNode);
    }

    private void handleForm(String formKey, BpmConfNode bpmConfNode) {
        String nodeId = bpmConfNode.getId();
        String nodeCode = bpmConfNode.getCode();
        String nodeName = bpmConfNode.getName();

        LocalDateTime now = LocalDateTime.now();

        BpmConfForm bpmConfForm = new BpmConfForm();
        bpmConfForm.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
        bpmConfForm.setValue(formKey);
        bpmConfForm.setType("external");
        bpmConfForm.setStatus("1");
        bpmConfForm.setNodeId(nodeId);
        bpmConfForm.setNodeCode(nodeCode);
        bpmConfForm.setNodeName(nodeName);
        bpmConfForm.setProcessModelId(modelId);

        bpmConfForm.setCreateTime(now);
        bpmConfForm.setUpdateTime(now);
        bpmConfForm.setCreateBy(Auto);
        bpmConfForm.setUpdateBy(Auto);
        bpmConfFormRepository.insertBpmConfForm(bpmConfForm);
    }

    private BpmConfNode handleBpmConfNode(String nodeId, String nodeName, String nodeType, int priority, ActReModel actReModel) {
        String actReModelId = actReModel.getId_();
        BpmConfNode bpmConfNode = bpmConfNodeRepository.findOneByCodeAndConfBaseId(nodeId, actReModelId);
        LocalDateTime now = LocalDateTime.now();
        if (bpmConfNode == null) {
            bpmConfNode = new BpmConfNode();
            bpmConfNode.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfNode.setCreateTime(now);
            bpmConfNode.setUpdateTime(now);
            bpmConfNode.setCreateBy(Auto);
            bpmConfNode.setUpdateBy(Auto);
            bpmConfNodeRepository.insertBpmConfNode(this.buildBpmConfNode(bpmConfNode, nodeId, nodeName, nodeType, bpmnModel, priority, actReModel));
        } else {
            bpmConfNode.setUpdateTime(now);
            bpmConfNode.setUpdateBy(Auto);
            bpmConfNodeRepository.updateBpmConfNode(this.buildBpmConfNode(bpmConfNode, nodeId, nodeName, nodeType, bpmnModel, priority, actReModel));
        }
        return bpmConfNode;
    }

    private BpmConfNode buildBpmConfNode(BpmConfNode bpmConfNode, String nodeId, String nodeName, String nodeType, BpmnModel bpmnModel, int priority, ActReModel actReModel) {
        Process process = bpmnModel.getMainProcess();
        String name = process.getName();
        String actReModelId = actReModel.getId_();

        bpmConfNode.setCode(nodeId);
        bpmConfNode.setName(nodeName);
        bpmConfNode.setType(nodeType);
        bpmConfNode.setPriority(priority);
        bpmConfNode.setStatus("1");
        bpmConfNode.setUseDeptRole("0");
        bpmConfNode.setGrabOrder("0");
        bpmConfNode.setConfBaseId(actReModelId);
        bpmConfNode.setModelName(name);

        return bpmConfNode;
    }
}
