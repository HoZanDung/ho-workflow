package cn.com.ho.workflow.infrastructure.repositories.task.impl;

import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefBaseRecord;
import cn.com.ho.workflow.infrastructure.repositories.task.TaskDefBaseRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2021/2/4
 */
@Component
public class TaskDefBaseRepositoryImpl implements TaskDefBaseRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.TaskDefBase TaskDefBase
            = cn.com.ho.workflow.infrastructure.db.tables.TaskDefBase.TASK_DEF_BASE;

    @Override
    public int insertTaskDefBase(cn.com.ho.workflow.domain.entities.task.TaskDefBase taskDefBase) {
        TaskDefBaseRecord taskDefBaseRecord = dslContext.newRecord(TaskDefBase);
        BeanUtils.copyProperties(taskDefBase, taskDefBaseRecord);
        return taskDefBaseRecord.insert();
    }

    @Override
    public int updateTaskDefBase(cn.com.ho.workflow.domain.entities.task.TaskDefBase taskDefBase) {
        TaskDefBaseRecord taskDefBaseRecord = dslContext.newRecord(TaskDefBase);
        BeanUtils.copyProperties(taskDefBase, taskDefBaseRecord);
        return taskDefBaseRecord.update();
    }

    @Override
    public cn.com.ho.workflow.domain.entities.task.TaskDefBase findOneByNodeCodeAndProcDefId(String nodeCode, String processDefinitionId) {
        return dslContext
                .select().from(TaskDefBase)
                .where(TaskDefBase.CODE.eq(nodeCode))
                .and(TaskDefBase.PROCESS_DEFINITION_ID.eq(processDefinitionId))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.task.TaskDefBase.class);
    }
}
