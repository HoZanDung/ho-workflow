package cn.com.ho.workflow.service.impl.process;

import cn.com.ho.workflow.cmd.SyncProcessCmd;
import cn.com.ho.workflow.domain.aggregates.ActReModelId;
import cn.com.ho.workflow.domain.aggregates.TPProcess;
import cn.com.ho.workflow.domain.commands.process.SaveProcessCommand;
import cn.com.ho.workflow.domain.entities.bpm.*;
import cn.com.ho.workflow.domain.entities.tp.TPProcDefXml;
import cn.com.ho.workflow.dto.ProcessPretreatmentReturnDTO;
import cn.com.ho.workflow.exception.DuplicateProcessKeyException;
import cn.com.ho.workflow.exception.ProcessPretreatmentException;
import cn.com.ho.workflow.infrastructure.actRepository.ActReModelRepository;
import cn.com.ho.workflow.infrastructure.actRepository.ActReProcdefRepository;
import cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel;
import cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef;
import cn.com.ho.workflow.infrastructure.repositories.bpm.*;
import cn.com.ho.workflow.infrastructure.repositories.tp.TPProcDefXMLRepository;
import cn.com.ho.workflow.infrastructure.repositories.tp.TPProcessRepository;
import cn.com.ho.workflow.service.ModelService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.Model;
import org.activiti.explorer.util.XmlUtil;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ProcessEngine processEngine;

    @Resource
    private RepositoryService repositoryService;

    @Resource
    private TPProcessRepository tpProcessRepository;

    @Resource
    private TPProcDefXMLRepository tpProcDefXMLRepository;

    @Resource
    private ActReModelRepository actReModelRepository;

    @Resource
    private ActReProcdefRepository actReProcdefRepository;

    @Resource
    private BpmConfNodeRepository bpmConfNodeRepository;

    @Resource
    private BpmConfUserRepository bpmConfUserRepository;

    @Resource
    private BpmConfFormRepository bpmConfFormRepository;

    @Resource
    private BpmConfListenerRepository bpmConfListenerRepository;

    @Resource
    private BpmConfCountersignRepository bpmConfCountersignRepository;

    private ProcessPretreatmentReturnDTO pretreatment(SaveProcessCommand saveProcessCommand) {
        //  创建流程聚合
        TPProcess process = new TPProcess(saveProcessCommand);
        process.handleXml(saveProcessCommand.getBpmnXml());
        process.replaceSingleQuotesToDoubleQuotation();
        String processXml = process.getProcessXml();

        try {
            //  拿出xml处理器
            XMLInputFactory xif = XmlUtil.createSafeXmlInputFactory();
            //  转化为流程引擎的的model
            InputStream is = new ByteArrayInputStream(processXml.getBytes(StandardCharsets.UTF_8));
            InputStreamReader in = new InputStreamReader(is, StandardCharsets.UTF_8);
            XMLStreamReader xtr = xif.createXMLStreamReader(in);
            BpmnModel bpmnModel = new BpmnXMLConverter().convertToBpmnModel(xtr);

            //  转化后判断是否成功
            if (bpmnModel.getMainProcess() == null || bpmnModel.getMainProcess().getId() == null) {
                //  转化失败
                throw new ProcessPretreatmentException("转化失败");
            }
            //  转化成功后继续处理
            BpmnJsonConverter converter = new BpmnJsonConverter();
            ObjectNode modelNode = converter.convertToJson(bpmnModel);
            if (modelNode.get("properties").get("process_id") == null) {
                //  流程id不能为空
                throw new ProcessPretreatmentException("流程id不能为空");
            }
            if (modelNode.get("properties").get("name") == null) {
                //  流程名称不能为空
                throw new ProcessPretreatmentException("流程名称不能为空");
            }

            //  解析流程xml,获取xml里面的节点信息
            ObjectNode modelObjectNode = new ObjectMapper().createObjectNode();

            String key = modelNode.get("properties").get("process_id").asText();
            String name = modelNode.get("properties").get("name").asText();
            String documentation = modelNode.get("properties").get("documentation") == null ? "" : modelNode.get("properties").get("documentation").asText();

            modelObjectNode.put("name", name);
            modelObjectNode.put("key", key);
            modelObjectNode.put("documentation", documentation);

            //  从流程图解析出来流程key
            process.setProcessKey(key);
            //  数据信息
            String metaInfo = modelObjectNode.toString();

            //  返回
            ProcessPretreatmentReturnDTO processPretreatmentReturnDTO = new ProcessPretreatmentReturnDTO();
            processPretreatmentReturnDTO.setProcessName(name);
            processPretreatmentReturnDTO.setProcessKey(key);
            processPretreatmentReturnDTO.setModelObjectNode(modelNode);
            processPretreatmentReturnDTO.setMetaInfo(metaInfo);
            processPretreatmentReturnDTO.setBpmnModel(bpmnModel);
            return processPretreatmentReturnDTO;
        } catch (XMLStreamException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int saveBpmnData(SaveProcessCommand saveProcessCommand) {
        ProcessPretreatmentReturnDTO pretreatment = pretreatment(saveProcessCommand);
        if (pretreatment != null) {
            String id = saveProcessCommand.getId();
            if (StringUtils.isEmpty(id)) {
                //  id为空是保存
                return modelSave(pretreatment, saveProcessCommand);
            } else {
                //  id不为空是更新
                return modelUpdate(pretreatment, saveProcessCommand);
            }
        } else {
            return -1;
        }
    }

    private int modelSave(ProcessPretreatmentReturnDTO pretreatment, SaveProcessCommand saveProcessCommand) {
        String processKey = pretreatment.getProcessKey();
        String metaInfo = pretreatment.getMetaInfo();
        String processName = pretreatment.getProcessName();
        //  id为空是保存,此时查询是否有重复的key
        TPProcess oneByProcessKey = tpProcessRepository.findOneByProcessKey(processKey);
        if (oneByProcessKey.isEmpty()) {
            //  流程模型key重复
            throw new DuplicateProcessKeyException("流程模型key重复");
        }
        //  保存进去ACT_RE_MODEL表
        Model modelData = repositoryService.newModel();
        modelData.setMetaInfo(metaInfo);
        modelData.setKey(processKey);
        modelData.setName(processName);
        repositoryService.saveModel(modelData);
        //  保存进去T_P_PROCESS表
        TPProcess tpProcess = new TPProcess(saveProcessCommand);
        tpProcess.handleXml(saveProcessCommand.getBpmnXml());
        tpProcess.combineActReModelAndTPProcess(modelData.getId());
        tpProcess.replaceSingleQuotesToDoubleQuotation();
        int i = tpProcessRepository.insertTPProcess(tpProcess);
        //  处理BPM_CONF_*表
        handleBPM(tpProcess.getModelId().getId(), pretreatment.getModelObjectNode(), pretreatment.getBpmnModel());
        return i;
    }

    private int modelUpdate(ProcessPretreatmentReturnDTO pretreatment, SaveProcessCommand saveProcessCommand) {
        String processId = saveProcessCommand.getId();
        String processKey = pretreatment.getProcessKey();
        String metaInfo = pretreatment.getMetaInfo();
        String processName = pretreatment.getProcessName();

        TPProcess tpProcess = tpProcessRepository.findOneByProcessId(processId);
        if (tpProcess == null) {
            throw new RuntimeException();
        }
        //  保存进去ACT_RE_MODEL表
        ActReModelId modelId = tpProcess.getModelId();
        Model modelData = repositoryService.getModel(modelId.getId());
        modelData.setMetaInfo(metaInfo);
        modelData.setKey(processKey);
        modelData.setName(processName);
        repositoryService.saveModel(modelData);
        //  保存进去T_P_PROCESS表
        tpProcess.handleXml(saveProcessCommand.getBpmnXml());
        tpProcess.combineActReModelAndTPProcess(modelData.getId());
        tpProcess.replaceSingleQuotesToDoubleQuotation();
        tpProcess.newUpdateTime();
        int i = tpProcessRepository.updateTPProcess(tpProcess);
        //  处理BPM_CONF_*表
        handleBPM(modelId.getId(), pretreatment.getModelObjectNode(), pretreatment.getBpmnModel());
        return i;
    }

    /**
     * 处理BPM_CONF_*表
     */
    private void handleBPM(String modelId, ObjectNode modelObjectNode, BpmnModel bpmnModel) {
        repositoryService.addModelEditorSource(modelId, modelObjectNode.toString().getBytes(StandardCharsets.UTF_8));
        processEngine.getManagementService().executeCommand(
                new SyncProcessCmd(modelId, bpmnModel, modelObjectNode,
                        actReModelRepository, bpmConfNodeRepository,
                        bpmConfUserRepository, bpmConfFormRepository,
                        bpmConfListenerRepository, bpmConfCountersignRepository)
        );
    }

    @Override
    public int deployBpmnModel(String actReModelId) {
        Model modelData = repositoryService.getModel(actReModelId);
        String modelDataId = modelData.getId();

        //  找到二进制数组
        byte[] bytes = repositoryService.getModelEditorSource(modelDataId);
        if (bytes == null) {
            //  模型数据为空
            return -1;
        }

        JsonNode modelNode;
        try {
            modelNode = new ObjectMapper().readTree(bytes);

            byte[] bpmnBytes;

            BpmnModel model = new BpmnJsonConverter().convertToBpmnModel(modelNode);
            bpmnBytes = new BpmnXMLConverter().convertToXML(model);

            //  生成二进制表的文件名
            String moduleName = modelData.getName();
            String processName = moduleName + ".bpmn20.xml";
            String processKey = modelData.getKey();

            //  流程引擎部署流程
            Deployment deployment = repositoryService.createDeployment()
                    .addString(processName, new String(bpmnBytes, StandardCharsets.UTF_8))
                    .name(processKey)
                    .category(moduleName)
                    .deploy();

            //  将deploymentId更新到模型表
            modelData.setDeploymentId(deployment.getId());
            repositoryService.saveModel(modelData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  根据modelId去t_p_process表找到2个XML和流程名字
        TPProcess tpProcess = tpProcessRepository.findOneByModelId(modelDataId);
        String processXml = tpProcess.getProcessXml();
        String bpmnXml = tpProcess.getBpmnXml();
        String processName = tpProcess.getName();
        //  从modelData拿到deploymentId,根据deploymentId去ACT_RE_PROCDEF表找到主键ID即流程定义id
        String deploymentId = modelData.getDeploymentId();
        ActReProcdef actReProcdef = actReProcdefRepository.findOneByDeploymentId(deploymentId);
        String procDefId = actReProcdef.getId_();
        //  将信息保存进t_p_proc_def_xml表内
        TPProcDefXml tpProcDefXml = new TPProcDefXml();
        tpProcDefXml.setProcDefId(procDefId);
        tpProcDefXml.setName(processName);
        tpProcDefXml.setProcessXml(processXml);
        tpProcDefXml.setBpmnXml(bpmnXml);
        return tpProcDefXMLRepository.insertTPProcDefXml(tpProcDefXml);
    }

    @Override
    public int migrationConfig(String actReModelId) {
        int migration = 0;

        ActReModel actReModel = actReModelRepository.findOneByActReModelId(actReModelId);
        if (actReModel != null) {
            String deploymentId_ = actReModel.getDeploymentId_();
            ActReProcdef actReProcdef = actReProcdefRepository.findOneByDeploymentId(deploymentId_);
            if (actReProcdef != null) {
                String actReProcdefId = actReProcdef.getId_();
                List<BpmConfNode> bpmConfNodes = bpmConfNodeRepository.selectByConfBaseId(actReModelId);
                for (BpmConfNode bpmConfNode : bpmConfNodes) {
                    migration = migration + migrationConfigCore(bpmConfNode, actReProcdefId);
                }
            }
        }
        return migration;
    }

    private int migrationConfigCore(BpmConfNode bpmConfNode, String processDefinitionId) {
        String nodeId = bpmConfNode.getId();
        String status = "1";

        BpmConfForm bpmConfForm = bpmConfFormRepository.findOneByNodeId(nodeId);
        BpmConfUser bpmConfUser = bpmConfUserRepository.findOneByNodeId(nodeId);
        BpmConfListener bpmConfListener = bpmConfListenerRepository.findOneByNodeId(nodeId);
        BpmConfCountersign bpmConfCountersign = bpmConfCountersignRepository.findOneByNodeId(nodeId);

        // 更新TaskDefinition

        return 0;
    }

    @Override
    public int deleteDeploy(String deploymentId) {
        repositoryService.deleteDeployment(deploymentId);
        return 1;
    }

    @Override
    public int deleteModel(String actReModelId) {
        repositoryService.deleteModel(actReModelId);
        return 1;
    }
}
