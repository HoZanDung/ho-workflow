package cn.com.ho.workflow.domain.repositories.task;

import cn.com.ho.workflow.domain.entities.task.TaskDefUser;

import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/4
 */
public interface TaskDefUserRepository {

    void batchInsertTaskDefUser(List<TaskDefUser> taskDefUserList);

    void updateTaskDefUser(TaskDefUser taskDefUser);

    void deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy);
}
