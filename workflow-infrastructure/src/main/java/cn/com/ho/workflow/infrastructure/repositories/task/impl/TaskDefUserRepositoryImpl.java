package cn.com.ho.workflow.infrastructure.repositories.task.impl;

import cn.com.ho.workflow.domain.entities.task.TaskDefUser;
import cn.com.ho.workflow.domain.repositories.task.TaskDefUserRepository;
import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefUserRecord;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HOZANDUNG on 2021/2/4
 */
@Component
public class TaskDefUserRepositoryImpl implements TaskDefUserRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.TaskDefUser TaskDefUser
            = cn.com.ho.workflow.infrastructure.db.tables.TaskDefUser.TASK_DEF_USER;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchInsertTaskDefUser(List<cn.com.ho.workflow.domain.entities.task.TaskDefUser> taskDefUserList) {
        List<TaskDefUserRecord> recordList = new ArrayList<>();
        for (cn.com.ho.workflow.domain.entities.task.TaskDefUser taskDefUser : taskDefUserList) {
            TaskDefUserRecord taskDefUserRecord = dslContext.newRecord(TaskDefUser);
            BeanUtils.copyProperties(taskDefUser, taskDefUserRecord);
            recordList.add(taskDefUserRecord);
        }
        dslContext.batchInsert(recordList).execute();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateTaskDefUser(TaskDefUser taskDefUser) {
        TaskDefUserRecord taskDefUserRecord = dslContext.newRecord(TaskDefUser);
        BeanUtils.copyProperties(taskDefUser, taskDefUserRecord);
        taskDefUserRecord.update();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByNodeCodeAndProcDefIdAndCreateBy(String nodeCode, String processDefinitionId, String createBy) {
        dslContext
                .delete(TaskDefUser)
                .where(TaskDefUser.NODE_CODE.eq(nodeCode))
                .and(TaskDefUser.PROCESS_DEFINITION_ID.eq(processDefinitionId))
                .and(TaskDefUser.CREATE_BY.eq(createBy))
                .execute();
    }
}
