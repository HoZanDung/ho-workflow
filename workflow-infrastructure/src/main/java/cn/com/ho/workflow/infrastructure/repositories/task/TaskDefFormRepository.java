package cn.com.ho.workflow.infrastructure.repositories.task;

import cn.com.ho.workflow.domain.entities.task.TaskDefForm;

import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/5
 */
public interface TaskDefFormRepository {

    int batchInsertTaskDefForm(List<TaskDefForm> taskDefFormList);

    int deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy);
}
