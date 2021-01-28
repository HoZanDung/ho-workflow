package cn.com.ho.workflow.cmd;


import cn.com.ho.workflow.diagram.Node;
import cn.com.ho.workflow.domain.entities.bpm.*;
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

    /**
     * 构造方法.
     */
    public SyncProcessCmd(BpmnModel bpmnModel, JsonNode modelNode, String modelId) {
        this.modelId = modelId;
        this.bpmnModel = bpmnModel;
        this.modelNode = modelNode;
    }

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
        this.processGlobal(bpmnModel, actReModel);

        int priority = 2;
        List<JsonNode> jsonNodeList = modelNode.findParents("resourceId");
        for (JsonNode jsonNode : jsonNodeList) {
            String nodeType;
            boolean stencil = jsonNode.has("stencil");
            if (stencil) {
                nodeType = jsonNode.findValue("stencil").findValue("id").asText();
                if (StringUtils.equals(nodeType, "ExclusiveGateway") ||
                        StringUtils.equals(nodeType, "UserTask") ||
                        StringUtils.equals(nodeType, "ManualTask") ||
                        StringUtils.equals(nodeType, "StartNoneEvent") ||
                        StringUtils.equals(nodeType, "EndNoneEvent")) {
                    String nodeId = jsonNode.findValue("properties").findValue("overrideid").asText();
                    String nodeName = jsonNode.findValue("properties").findValue("name") == null ? nodeId : jsonNode.findValue("properties").findValue("name").asText();

                    Node node = new Node();
                    node.setId(nodeId);
                    node.setType(nodeType);
                    node.setName(nodeName);
                    if (StringUtils.equals(nodeType, "UserTask") || StringUtils.equals(nodeType, "ManualTask")) {
                        processUserTask(node, bpmnModel, priority++, actReModel);
                    }
                    if (StringUtils.equals(nodeType, "StartNoneEvent")) {
                        processStartEvent(node, bpmnModel, priority++, actReModel);
                    }
                    if (StringUtils.equals(nodeType, "EndNoneEvent")) {
                        processEndEvent(node, bpmnModel, priority++, actReModel);
                    }
                }
            }
        }
        return null;
    }

    /**
     * 全局配置.
     */
    private void processGlobal(BpmnModel bpmnModel, ActReModel actReModel) {
        Process process = bpmnModel.getMainProcess();
        BpmConfNode bpmConfNode = bpmConfNodeRepository.findOneByCodeAndConfBaseId(process.getId(), actReModel.getId_());
        if (bpmConfNode == null) {
            bpmConfNode = new BpmConfNode();

            bpmConfNode.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfNode.setCode(process.getId());
            bpmConfNode.setName("全局");
            bpmConfNode.setType("process");
            bpmConfNode.setPriority(1);
            bpmConfNode.setStatus("1");
            bpmConfNode.setConfBaseId(actReModel.getId_());
            bpmConfNodeRepository.insertBpmConfNode(bpmConfNode);
        } else {
            bpmConfNode.setStatus("1");
            bpmConfNode.setCode(process.getId());
            bpmConfNode.setName("全局");
            bpmConfNode.setType("process");
            bpmConfNode.setPriority(1);
            bpmConfNode.setStatus("1");
            bpmConfNode.setConfBaseId(actReModel.getId_());
            bpmConfNodeRepository.updateBpmConfNode(bpmConfNode);
        }
        // 配置监听器
        processListener(process.getExecutionListeners(), bpmConfNode);
    }

    /**
     * 配置用户任务.
     */
    private void processUserTask(Node node, BpmnModel bpmnModel, int priority, ActReModel actReModel) {
        String actReModelId = actReModel.getId_();
        String nodeId = node.getId();
        UserTask userTask = (UserTask) bpmnModel.getFlowElement(nodeId);
        BpmConfNode bpmConfNode = bpmConfNodeRepository.findOneByCodeAndConfBaseId(nodeId, actReModelId);
        if (bpmConfNode == null) {
            bpmConfNode = new BpmConfNode();

            bpmConfNode.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfNode.setCode(nodeId);
            bpmConfNode.setName(node.getName());
            bpmConfNode.setType(node.getType());
            bpmConfNode.setStatus("1");
            bpmConfNode.setUseDeptRole("0");
            bpmConfNode.setPriority(priority);
            bpmConfNode.setGrabOrder("0");
            bpmConfNode.setConfBaseId(actReModelId);
            bpmConfNodeRepository.insertBpmConfNode(bpmConfNode);
        } else {
            bpmConfNode.setCode(nodeId);
            bpmConfNode.setName(node.getName());
            bpmConfNode.setType(node.getType());
            bpmConfNode.setStatus("1");
            bpmConfNode.setUseDeptRole("0");
            bpmConfNode.setPriority(priority);
            bpmConfNode.setGrabOrder("0");
            bpmConfNode.setConfBaseId(actReModelId);
            bpmConfNodeRepository.updateBpmConfNode(bpmConfNode);
        }

        // 配置参与者
        int index = 1;
        index = this.processUserTaskConf(bpmConfNode, userTask.getAssignee(), "0", index);
        for (String candidateUser : userTask.getCandidateUsers()) {
            index = this.processUserTaskConf(bpmConfNode, candidateUser, "1", index);
        }
        for (String candidateGroup : userTask.getCandidateGroups()) {
            this.processUserTaskConf(bpmConfNode, candidateGroup, "2", index);
        }

        // 配置监听器
        this.processListener(userTask.getExecutionListeners(), bpmConfNode);
        this.processListener(userTask.getTaskListeners(), bpmConfNode);
        // 配置表单
        this.processForm(userTask, bpmConfNode);

        // 会签
        if (userTask.getLoopCharacteristics() != null) {
            BpmConfCountersign bpmConfCountersign = new BpmConfCountersign();

            bpmConfCountersign.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfCountersign.setType("all");//    会签类型 all：全票通过 percent：比例通过
            bpmConfCountersign.setRate(100);
            bpmConfCountersign.setNodeId(bpmConfNode.getId());
            bpmConfCountersign.setParticipant(userTask.getLoopCharacteristics().getLoopCardinality());
            if (userTask.getLoopCharacteristics().isSequential()) {
                bpmConfCountersign.setSequential("sequential");
            } else {
                bpmConfCountersign.setSequential("parallel");
            }
            bpmConfCountersign.setStatus("1");
            bpmConfCountersign.setProcessModelId(modelId);
            BpmConfCountersign bpmConfCountersigns = bpmConfCountersignRepository.findOneBySeqParTypeNodeId(
                    bpmConfCountersign.getSequential(),
                    bpmConfCountersign.getParticipant(),
                    bpmConfCountersign.getType(),
                    bpmConfNode.getId());
            if (bpmConfCountersigns != null) {
                bpmConfCountersigns.setStatus("1");
                bpmConfCountersignRepository.updateBpmConfCounterSign(bpmConfCountersign);
            } else {
                bpmConfCountersignRepository.insertBpmConfCountersign(bpmConfCountersign);
            }
        }
    }

    /**
     * 配置参与者.
     */
    public int processUserTaskConf(BpmConfNode bpmConfNode, String value, String type, int priority) {
        if (value == null) {
            return priority;
        }

        String nodeId = bpmConfNode.getId();
        BpmConfUser bpmConfUser = bpmConfUserRepository.findOneByValueTypeProNodeId(value, type, priority, nodeId);
        LocalDateTime now = LocalDateTime.now();
        if (bpmConfUser == null) {
            bpmConfUser = new BpmConfUser();

            bpmConfUser.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfUser.setValue(value);
            bpmConfUser.setType(type);
            bpmConfUser.setStatus("1");
            bpmConfUser.setPriority(priority);
            bpmConfUser.setCreateTime(now);
            bpmConfUser.setUpdateTime(now);
            bpmConfUser.setNodeId(nodeId);
            bpmConfUser.setProcessModelId(this.modelId);
            bpmConfUserRepository.insertBpmConfUser(bpmConfUser);
        } else {
            bpmConfUser.setStatus("1");
            bpmConfUser.setUpdateTime(now);
            bpmConfUser.setValue(value);
            bpmConfUser.setType(type);
            bpmConfUser.setPriority(priority);
            bpmConfUser.setStatus("1");
            bpmConfUser.setNodeId(nodeId);
            bpmConfUser.setProcessModelId(this.modelId);
            bpmConfUserRepository.updateBpmConfUser(bpmConfUser);
        }
        return priority + 1;
    }

    /**
     * 配置开始事件.
     */
    private void processStartEvent(Node node, BpmnModel bpmnModel, int priority, ActReModel actReModel) {
        String nodeId = node.getId();
        String actReModelId = actReModel.getId_();
        BpmConfNode bpmConfNode = bpmConfNodeRepository.findOneByCodeAndConfBaseId(nodeId, actReModelId);
        if (bpmConfNode == null) {
            bpmConfNode = new BpmConfNode();

            bpmConfNode.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfNode.setCode(node.getId());
            bpmConfNode.setName(node.getName());
            bpmConfNode.setType(node.getType());
            bpmConfNode.setPriority(priority);
            bpmConfNode.setStatus("1");
            bpmConfNode.setUseDeptRole("0");
            bpmConfNode.setGrabOrder("0");
            bpmConfNode.setConfBaseId(actReModelId);
            bpmConfNodeRepository.insertBpmConfNode(bpmConfNode);
        } else {
            bpmConfNode.setCode(nodeId);
            bpmConfNode.setName(node.getName());
            bpmConfNode.setType(node.getType());
            bpmConfNode.setPriority(priority);
            bpmConfNode.setStatus("1");
            bpmConfNode.setUseDeptRole("0");
            bpmConfNode.setGrabOrder("0");
            bpmConfNode.setConfBaseId(actReModelId);
            bpmConfNodeRepository.updateBpmConfNode(bpmConfNode);
        }

        FlowElement flowElement = bpmnModel.getFlowElement(node.getId());
        // 配置监听器
        this.processListener(flowElement.getExecutionListeners(), bpmConfNode);
        StartEvent startEvent = (StartEvent) flowElement;
        // 配置表单
        this.processForm(startEvent, bpmConfNode);
    }

    /**
     * 配置结束事件.
     */
    private void processEndEvent(Node node, BpmnModel bpmnModel, int priority, ActReModel actReModel) {
        String nodeId = node.getId();
        String actReModelId = actReModel.getId_();
        BpmConfNode bpmConfNode = bpmConfNodeRepository.findOneByCodeAndConfBaseId(nodeId, actReModelId);
        if (bpmConfNode == null) {
            bpmConfNode = new BpmConfNode();

            bpmConfNode.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfNode.setCode(nodeId);
            bpmConfNode.setName(node.getName());
            bpmConfNode.setType(node.getType());
            bpmConfNode.setPriority(priority);
            bpmConfNode.setStatus("1");
            bpmConfNode.setUseDeptRole("0");
            bpmConfNode.setGrabOrder("0");
            bpmConfNode.setConfBaseId(actReModelId);
            bpmConfNodeRepository.insertBpmConfNode(bpmConfNode);
        } else {
            bpmConfNode.setCode(nodeId);
            bpmConfNode.setName(node.getName());
            bpmConfNode.setType(node.getType());
            bpmConfNode.setPriority(priority);
            bpmConfNode.setStatus("1");
            bpmConfNode.setUseDeptRole("0");
            bpmConfNode.setGrabOrder("0");
            bpmConfNode.setConfBaseId(actReModelId);
            bpmConfNodeRepository.updateBpmConfNode(bpmConfNode);
        }

        FlowElement flowElement = bpmnModel.getFlowElement(node.getId());
        // 配置监听器
        this.processListener(flowElement.getExecutionListeners(), bpmConfNode);
    }

    /**
     * 配置监听器.
     */
    public void processListener(List<ActivitiListener> activityListeners, BpmConfNode bpmConfNode) {
        for (ActivitiListener activitiListener : activityListeners) {
            String value = activitiListener.getImplementation();
            String type = activitiListener.getEvent();
            String bpmConfNodeId = bpmConfNode.getId();

            BpmConfListener bpmConfListener = bpmConfListenerRepository.findOneByValueTypeNodeId(value, type, bpmConfNodeId);
            LocalDateTime now = LocalDateTime.now();
            if (bpmConfListener == null) {
                bpmConfListener = new BpmConfListener();

                bpmConfListener.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
                bpmConfListener.setValue(value);
                bpmConfListener.setNodeId(bpmConfNodeId);
                bpmConfListener.setStatus("1");
                bpmConfListener.setType(type);
                bpmConfListener.setExtStatus("1");
                bpmConfListener.setCreateTime(now);
                bpmConfListener.setUpdateTime(now);
                bpmConfListener.setProcessModelId(modelId);
                bpmConfListenerRepository.insertBpmConfListener(bpmConfListener);
            } else {
                bpmConfListener.setValue(value);
                bpmConfListener.setNodeId(bpmConfNodeId);
                bpmConfListener.setStatus("1");
                bpmConfListener.setType(type);
                bpmConfListener.setExtStatus("1");
                bpmConfListener.setUpdateTime(now);
                bpmConfListener.setProcessModelId(modelId);
                bpmConfListenerRepository.updateBpmConfListener(bpmConfListener);
            }
        }
    }

    /**
     * 配置表单，userTask.
     */
    public void processForm(UserTask userTask, BpmConfNode bpmConfNode) {
        if (userTask.getFormKey() == null) {
            return;
        }

        String nodeId = bpmConfNode.getId();
        BpmConfForm bpmConfForm = bpmConfFormRepository.findOneByNodeId(nodeId);
        LocalDateTime now = LocalDateTime.now();
        if (bpmConfForm == null) {
            bpmConfForm = new BpmConfForm();
            bpmConfForm.setValue(userTask.getFormKey());
            bpmConfForm.setType("external");//类型 internal:内部 电子表单 external:外部 外部表单
            bpmConfForm.setStatus("1");
            bpmConfForm.setNodeId(nodeId);
            bpmConfForm.setProcessModelId(this.modelId);
            bpmConfForm.setCreateTime(now);
            bpmConfForm.setUpdateTime(now);
            bpmConfFormRepository.insertBpmConfForm(bpmConfForm);
        } else {
            bpmConfForm.setValue(userTask.getFormKey());
            bpmConfForm.setType("external");
            bpmConfForm.setStatus("1");
            bpmConfForm.setNodeId(nodeId);
            bpmConfForm.setProcessModelId(this.modelId);
            bpmConfForm.setUpdateTime(now);
            bpmConfFormRepository.updateBpmConfForm(bpmConfForm);
        }
    }

    /**
     * 配置表单，startEvent.
     */
    public void processForm(StartEvent startEvent, BpmConfNode bpmConfNode) {
        if (startEvent.getFormKey() == null) {
            return;
        }
        String nodeId = bpmConfNode.getId();
        BpmConfForm bpmConfForm = bpmConfFormRepository.findOneByNodeId(nodeId);
        LocalDateTime now = LocalDateTime.now();
        if (bpmConfForm == null) {
            bpmConfForm = new BpmConfForm();

            bpmConfForm.setId(IdWorker.getFlowIdWorkerInstance().nextIdStr());
            bpmConfForm.setValue(startEvent.getFormKey());
            bpmConfForm.setType("external");
            bpmConfForm.setStatus("1");
            bpmConfForm.setNodeId(bpmConfNode.getId());
            bpmConfForm.setProcessModelId(modelId);
            bpmConfForm.setCreateTime(now);
            bpmConfForm.setUpdateTime(now);
            bpmConfFormRepository.insertBpmConfForm(bpmConfForm);
        } else {
            bpmConfForm.setValue(startEvent.getFormKey());
            bpmConfForm.setType("external");
            bpmConfForm.setStatus("1");
            bpmConfForm.setNodeId(nodeId);
            bpmConfForm.setProcessModelId(this.modelId);
            bpmConfForm.setUpdateTime(now);
            bpmConfFormRepository.updateBpmConfForm(bpmConfForm);
        }
    }
}
