package cn.com.ho.workflow.service.impl;

import cn.com.ho.workflow.service.FlowOperationService;
import com.google.common.base.Preconditions;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by HOZANDUNG on 2022/2/24
 */
@Service
public class FlowOperationServiceImpl implements FlowOperationService {

    @Resource
    private ProcessEngine processEngine;

    @Override
    public void startBusProcess(String userId, String processDefinitionKey, String businessKey, Map<String, Object> variables, Map<String, Object> businessMap) {
        variables.put("initiator", userId);
        ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey(processDefinitionKey, businessKey, variables);
        Preconditions.checkNotNull(processInstance, "流程启动失败,返回实例为空");

    }
}
