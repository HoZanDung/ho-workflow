package cn.com.ho.workflow.service;

import java.util.Map;

/**
 * Created by HOZANDUNG on 2022/2/24
 */
public interface FlowOperationService {

    void startBusProcess(String userId, String processDefinitionKey, String businessKey, Map<String, Object> variables, Map<String, Object> businessMap);
}
