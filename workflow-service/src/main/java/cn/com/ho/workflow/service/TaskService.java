package cn.com.ho.workflow.service;

import java.time.LocalDateTime;

/**
 * Created by HOZANDUNG on 2021/2/4
 */
public interface TaskService {

    void migrateBpmUserToTaskUser(String bpmConfNodeId, String bpmConfNodeCode, String processDefinitionId, String taskBaseId, LocalDateTime now);

    void migrateBpmFormToTaskForm(String bpmConfNodeId, String bpmConfNodeCode, String processDefinitionId, String taskBaseId, LocalDateTime now);

    void migrateBpmFormToTaskListener(String bpmConfNodeId, String bpmConfNodeCode, String processDefinitionId, String taskBaseId, LocalDateTime now);
}
