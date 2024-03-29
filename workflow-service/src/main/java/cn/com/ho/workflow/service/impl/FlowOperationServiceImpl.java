package cn.com.ho.workflow.service.impl;

import cn.com.ho.workflow.domain.entities.tp.TPBaseBusiness;
import cn.com.ho.workflow.domain.repositories.tp.TPBaseBusinessRepository;
import cn.com.ho.workflow.service.FlowOperationService;
import com.google.common.base.Preconditions;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by HOZANDUNG on 2022/2/24
 */
@Service
public class FlowOperationServiceImpl implements FlowOperationService {

    @Resource
    private ProcessEngine processEngine;

    @Resource
    private TPBaseBusinessRepository tpBaseBusinessRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void startBusProcess(String userId, String processDefinitionKey, String businessKey, Map<String, Object> variables, Map<String, Object> businessMap) {
        variables.put("initiator", userId);
        Preconditions.checkNotNull(businessKey, "业务key为空,流程启动失败");
        ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey(processDefinitionKey, businessKey, variables);
        Preconditions.checkNotNull(processInstance, "流程启动失败,返回实例为空");
        this.insertBusProcess(businessKey, processInstance.getProcessInstanceId(), businessMap);
    }

    private void insertBusProcess(String businessId, String processInstanceId, Map<String, Object> businessMap) {
        TPBaseBusiness tpBaseBusiness = tpBaseBusinessRepository.findById(businessId);
        if (tpBaseBusiness != null) {

        }
    }
}
