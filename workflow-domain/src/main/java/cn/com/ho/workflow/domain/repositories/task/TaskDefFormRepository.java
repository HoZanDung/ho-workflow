package cn.com.ho.workflow.domain.repositories.task;

import cn.com.ho.workflow.domain.entities.task.TaskDefForm;

import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/5
 */
public interface TaskDefFormRepository {

    void batchInsertTaskDefForm(List<TaskDefForm> taskDefFormList);

    void deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy);
}
