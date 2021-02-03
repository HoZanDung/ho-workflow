package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfUser;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfUserRecord;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfUserRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
@Component
public class BpmConfUserRepositoryImpl implements BpmConfUserRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfUser BpmConfUser
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfUser.BPM_CONF_USER;

    @Override
    public int insertBpmConfUser(BpmConfUser bpmConfUser) {
        BpmConfUserRecord bpmConfUserRecord = dslContext.newRecord(BpmConfUser);
        BeanUtils.copyProperties(bpmConfUser, bpmConfUserRecord);
        return bpmConfUserRecord.insert();
    }

    @Override
    public int deleteByProcessModelId(String processModelId) {
        return dslContext.delete(BpmConfUser).where(BpmConfUser.PROCESS_MODEL_ID.eq(processModelId)).execute();
    }

    @Override
    public int deleteByNodeIdAndCreateBy(String nodeId, String createBy) {
        return dslContext.delete(BpmConfUser).where(BpmConfUser.NODE_ID.eq(nodeId)).and(BpmConfUser.CREATE_BY.eq(createBy)).execute();
    }

    @Override
    public int countByNodeId(String nodeId) {
        return dslContext.selectCount().from(BpmConfUser).where(BpmConfUser.NODE_ID.eq(nodeId)).fetchOne().value1();
    }
}
