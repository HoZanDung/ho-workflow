package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfCountersign;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfCountersignRecord;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfCountersignRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/2
 */
@Component
public class BpmConfCountersignRepositoryImpl implements BpmConfCountersignRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfCountersign BpmConfCountersign
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfCountersign.BPM_CONF_COUNTERSIGN;

    @Override
    public int insertBpmConfCountersign(BpmConfCountersign bpmConfCountersign) {
        BpmConfCountersignRecord bpmConfCountersignRecord = dslContext.newRecord(BpmConfCountersign);
        BeanUtils.copyProperties(bpmConfCountersign, bpmConfCountersignRecord);
        return bpmConfCountersignRecord.insert();
    }

    @Override
    public int deleteByNodeId(String nodeId) {
        return dslContext.delete(BpmConfCountersign).where(BpmConfCountersign.NODE_ID.eq(nodeId)).execute();
    }

    @Override
    public BpmConfCountersign selectByNodeIdAndStatus(String nodeId, String status) {
        return dslContext
                .select().from(BpmConfCountersign)
                .where(BpmConfCountersign.NODE_ID.eq(nodeId))
                .and(BpmConfCountersign.STATUS.eq(status))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfCountersign.class);
    }

}
