package cn.com.ho.workflow.infrastructure.repositories.task;

import cn.com.ho.workflow.domain.entities.task.TaskDefUser;

import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/4
 */
public interface TaskDefUserRepository {

    int batchInsertTaskDefUser(List<TaskDefUser> taskDefUserList);

    int updateTaskDefUser(TaskDefUser taskDefUser);

    int deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy);
}
