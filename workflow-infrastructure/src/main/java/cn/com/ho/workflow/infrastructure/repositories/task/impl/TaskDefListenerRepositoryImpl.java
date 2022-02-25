package cn.com.ho.workflow.infrastructure.repositories.task.impl;

import cn.com.ho.workflow.domain.entities.task.TaskDefListener;
import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefListenerRecord;
import cn.com.ho.workflow.domain.repositories.task.TaskDefListenerRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/5
 */
@Component
public class TaskDefListenerRepositoryImpl implements TaskDefListenerRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.TaskDefListener TaskDefListener
            = cn.com.ho.workflow.infrastructure.db.tables.TaskDefListener.TASK_DEF_LISTENER;

    @Override
    public int batchInsertTaskDefListener(List<TaskDefListener> taskDefListenerList) {
        List<TaskDefListenerRecord> recordList = new ArrayList<>();
        for (cn.com.ho.workflow.domain.entities.task.TaskDefListener taskDefListener : taskDefListenerList) {
            TaskDefListenerRecord taskDefListenerRecord = dslContext.newRecord(TaskDefListener);
            BeanUtils.copyProperties(taskDefListener, taskDefListenerRecord);
            recordList.add(taskDefListenerRecord);
        }
        return dslContext.batchInsert(recordList).execute().length;
    }

    @Override
    public int deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy) {
        return dslContext
                .delete(TaskDefListener)
                .where(TaskDefListener.NODE_CODE.eq(nodeCode))
                .and(TaskDefListener.PROCESS_DEFINITION_ID.eq(processDefinitionId))
                .and(TaskDefListener.CREATE_BY.eq(createBy))
                .execute();
    }
}
