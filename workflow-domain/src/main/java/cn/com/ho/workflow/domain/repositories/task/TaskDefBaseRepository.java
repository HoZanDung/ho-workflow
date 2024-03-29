package cn.com.ho.workflow.domain.repositories.task;

import cn.com.ho.workflow.domain.entities.task.TaskDefBase;

/**
 * Created by HOZANDUNG on 2021/2/4
 */
public interface TaskDefBaseRepository {

    void insertTaskDefBase(TaskDefBase taskDefBase);

    void updateTaskDefBase(TaskDefBase taskDefBase);

    TaskDefBase findOneByNodeCodeAndProcDefId(String nodeCode, String processDefinitionId);
}
