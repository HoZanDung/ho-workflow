package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfListener;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfListenerRecord;
import cn.com.ho.workflow.domain.repositories.bpm.BpmConfListenerRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
    public int deleteByNodeIdAndCreateBy(String nodeId, String createBy) {
        return dslContext.delete(BpmConfListener).where(BpmConfListener.NODE_ID.eq(nodeId)).and(BpmConfListener.CREATE_BY.eq(createBy)).execute();
    }

    @Override
    public int countByNodeId(String nodeId) {
        return dslContext.selectCount().from(BpmConfListener).where(BpmConfListener.NODE_ID.eq(nodeId)).fetchOne().value1();
    }

    @Override
    public List<cn.com.ho.workflow.domain.entities.bpm.BpmConfListener> selectByNodeIdAndStatus(String nodeId, String status) {
        return dslContext
                .select().from(BpmConfListener)
                .where(BpmConfListener.NODE_ID.eq(nodeId))
                .and(BpmConfListener.STATUS.eq(status))
                .fetchInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfListener.class);
    }
}
