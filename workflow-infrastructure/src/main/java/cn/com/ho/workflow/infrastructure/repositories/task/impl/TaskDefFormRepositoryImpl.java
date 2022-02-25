package cn.com.ho.workflow.infrastructure.repositories.task.impl;

import cn.com.ho.workflow.domain.repositories.task.TaskDefFormRepository;
import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefFormRecord;
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
public class TaskDefFormRepositoryImpl implements TaskDefFormRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.TaskDefForm TaskDefForm
            = cn.com.ho.workflow.infrastructure.db.tables.TaskDefForm.TASK_DEF_FORM;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchInsertTaskDefForm(List<cn.com.ho.workflow.domain.entities.task.TaskDefForm> taskDefFormList) {
        List<TaskDefFormRecord> recordList = new ArrayList<>();
        for (cn.com.ho.workflow.domain.entities.task.TaskDefForm taskDefForm : taskDefFormList) {
            TaskDefFormRecord taskDefFormRecord = dslContext.newRecord(TaskDefForm);
            BeanUtils.copyProperties(taskDefForm, taskDefFormRecord);
            recordList.add(taskDefFormRecord);
        }
        dslContext.batchInsert(recordList).execute();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy) {
        dslContext
                .delete(TaskDefForm)
                .where(TaskDefForm.NODE_CODE.eq(nodeCode))
                .and(TaskDefForm.PROCESS_DEFINITION_ID.eq(processDefinitionId))
                .and(TaskDefForm.CREATE_BY.eq(createBy))
                .execute();
    }
}
