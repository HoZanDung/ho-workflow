package cn.com.ho.workflow.infrastructure.repositories.task.impl;

import cn.com.ho.workflow.domain.entities.task.TaskDefListener;
import cn.com.ho.workflow.domain.repositories.task.TaskDefListenerRepository;
import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefListenerRecord;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(rollbackFor = Exception.class)
    public void batchInsertTaskDefListener(List<TaskDefListener> taskDefListenerList) {
        List<TaskDefListenerRecord> recordList = new ArrayList<>();
        for (cn.com.ho.workflow.domain.entities.task.TaskDefListener taskDefListener : taskDefListenerList) {
            TaskDefListenerRecord taskDefListenerRecord = dslContext.newRecord(TaskDefListener);
            BeanUtils.copyProperties(taskDefListener, taskDefListenerRecord);
            recordList.add(taskDefListenerRecord);
        }
        dslContext.batchInsert(recordList).execute();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy) {
        dslContext
                .delete(TaskDefListener)
                .where(TaskDefListener.NODE_CODE.eq(nodeCode))
                .and(TaskDefListener.PROCESS_DEFINITION_ID.eq(processDefinitionId))
                .and(TaskDefListener.CREATE_BY.eq(createBy))
                .execute();
    }
}
