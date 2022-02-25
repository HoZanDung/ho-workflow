package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfListener;
import cn.com.ho.workflow.domain.repositories.bpm.BpmConfListenerRepository;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfListenerRecord;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(rollbackFor = Exception.class)
    public void insertBpmConfListener(BpmConfListener bpmConfListener) {
        BpmConfListenerRecord bpmConfListenerRecord = dslContext.newRecord(BpmConfListener);
        BeanUtils.copyProperties(bpmConfListener, bpmConfListenerRecord);
        bpmConfListenerRecord.insert();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByNodeIdAndCreateBy(String nodeId, String createBy) {
        dslContext.delete(BpmConfListener).where(BpmConfListener.NODE_ID.eq(nodeId)).and(BpmConfListener.CREATE_BY.eq(createBy)).execute();
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
