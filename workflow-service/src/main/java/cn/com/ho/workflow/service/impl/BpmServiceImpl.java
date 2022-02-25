package cn.com.ho.workflow.service.impl;

import cn.com.ho.workflow.cmd.SyncProcessCmd;
import cn.com.ho.workflow.domain.repositories.bpm.*;
import cn.com.ho.workflow.infrastructure.actRepository.ActReModelRepository;
import cn.com.ho.workflow.service.BpmService;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

/**
 * Created by HOZANDUNG on 2021/2/3
 */
@Service
public class BpmServiceImpl implements BpmService {

    @Autowired
    private ProcessEngine processEngine;

    @Resource
    private RepositoryService repositoryService;

    @Resource
    private ActReModelRepository actReModelRepository;

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

    /**
     * 处理BPM_CONF_*表
     */
    @Async
    @Override
    public void handleBPM(String modelId, ObjectNode modelObjectNode, BpmnModel bpmnModel) {
        repositoryService.addModelEditorSource(modelId, modelObjectNode.toString().getBytes(StandardCharsets.UTF_8));
        processEngine.getManagementService().executeCommand(
                new SyncProcessCmd(modelId, bpmnModel, modelObjectNode,
                        actReModelRepository, bpmConfNodeRepository,
                        bpmConfUserRepository, bpmConfFormRepository,
                        bpmConfListenerRepository, bpmConfCountersignRepository)
        );
    }
}
