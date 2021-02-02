package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfUser;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfUserRecord;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfUserRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public int updateBpmConfUser(BpmConfUser bpmConfUser) {
        BpmConfUserRecord bpmConfUserRecord = dslContext.newRecord(BpmConfUser);
        BeanUtils.copyProperties(bpmConfUser, bpmConfUserRecord);
        return bpmConfUserRecord.update();
    }

    @Override
    public BpmConfUser findOneByValueTypeProNodeId(String value, String type, int priority, String nodeId) {
        return dslContext
                .select().from(BpmConfUser)
                .where(BpmConfUser.VALUE.eq(value))
                .and(BpmConfUser.TYPE.eq(type))
                .and(BpmConfUser.PRIORITY.eq(priority))
                .and(BpmConfUser.NODE_ID.eq(nodeId))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfUser.class);
    }

    @Override
    public BpmConfUser findOneByNodeId(String nodeId) {
        return dslContext
                .select().from(BpmConfUser)
                .where(BpmConfUser.NODE_ID.eq(nodeId))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfUser.class);
    }
}
