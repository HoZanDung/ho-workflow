package cn.com.ho.workflow.domain.repositories.task;

import cn.com.ho.workflow.domain.entities.task.TaskDefListener;

import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/5
 */
public interface TaskDefListenerRepository {

    int batchInsertTaskDefListener(List<TaskDefListener> taskDefListenerList);

    int deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy);
}
