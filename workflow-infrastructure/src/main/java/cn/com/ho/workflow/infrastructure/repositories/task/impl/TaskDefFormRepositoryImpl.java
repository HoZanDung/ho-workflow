package cn.com.ho.workflow.infrastructure.repositories.task.impl;

import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefFormRecord;
import cn.com.ho.workflow.domain.repositories.task.TaskDefFormRepository;
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
public class TaskDefFormRepositoryImpl implements TaskDefFormRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.TaskDefForm TaskDefForm
            = cn.com.ho.workflow.infrastructure.db.tables.TaskDefForm.TASK_DEF_FORM;

    @Override
    public int batchInsertTaskDefForm(List<cn.com.ho.workflow.domain.entities.task.TaskDefForm> taskDefFormList) {
        List<TaskDefFormRecord> recordList = new ArrayList<>();
        for (cn.com.ho.workflow.domain.entities.task.TaskDefForm taskDefForm : taskDefFormList) {
            TaskDefFormRecord taskDefFormRecord = dslContext.newRecord(TaskDefForm);
            BeanUtils.copyProperties(taskDefForm, taskDefFormRecord);
            recordList.add(taskDefFormRecord);
        }
        return dslContext.batchInsert(recordList).execute().length;
    }

    @Override
    public int deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy) {
        return dslContext
                .delete(TaskDefForm)
                .where(TaskDefForm.NODE_CODE.eq(nodeCode))
                .and(TaskDefForm.PROCESS_DEFINITION_ID.eq(processDefinitionId))
                .and(TaskDefForm.CREATE_BY.eq(createBy))
                .execute();
    }
}
