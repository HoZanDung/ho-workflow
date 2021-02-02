package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfListener;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfListenerRecord;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfListenerRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2020/12/2
 */
@Component
public class BpmConfListenerRepositoryImpl implements BpmConfListenerRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfListener BpmConfListener
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfListener.BPM_CONF_LISTENER;

    @Override
    public int insertBpmConfListener(BpmConfListener bpmConfListener) {
        BpmConfListenerRecord bpmConfListenerRecord = dslContext.newRecord(BpmConfListener);
        BeanUtils.copyProperties(bpmConfListener, bpmConfListenerRecord);
        return bpmConfListenerRecord.insert();
    }

    @Override
    public int updateBpmConfListener(BpmConfListener bpmConfListener) {
        BpmConfListenerRecord bpmConfListenerRecord = dslContext.newRecord(BpmConfListener);
        BeanUtils.copyProperties(bpmConfListener, bpmConfListenerRecord);
        return bpmConfListenerRecord.update();
    }

    @Override
    public BpmConfListener findOneByValueTypeNodeId(String value, String type, String nodeId) {
        return dslContext
                .select().from(BpmConfListener)
                .where(BpmConfListener.VALUE.eq(value))
                .and(BpmConfListener.TYPE.eq(type))
                .and(BpmConfListener.NODE_ID.eq(nodeId))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfListener.class);
    }

    @Override
    public cn.com.ho.workflow.domain.entities.bpm.BpmConfListener findOneByNodeId(String nodeId) {
        return dslContext
                .select().from(BpmConfListener)
                .where(BpmConfListener.NODE_ID.eq(nodeId))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfListener.class);
    }
}
