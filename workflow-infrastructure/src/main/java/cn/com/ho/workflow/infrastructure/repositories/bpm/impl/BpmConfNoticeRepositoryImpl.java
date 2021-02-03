package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfNoticeRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2021/2/3
 */
@Component
public class BpmConfNoticeRepositoryImpl implements BpmConfNoticeRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfNotice BpmConfNotice
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfNotice.BPM_CONF_NOTICE;

    @Override
    public int countByNodeId(String nodeId) {
        return dslContext.selectCount().from(BpmConfNotice).where(BpmConfNotice.NODE_ID.eq(nodeId)).fetchOne().value1();
    }
}
