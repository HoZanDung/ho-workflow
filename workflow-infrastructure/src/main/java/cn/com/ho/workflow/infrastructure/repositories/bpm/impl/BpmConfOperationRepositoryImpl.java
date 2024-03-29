package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.repositories.bpm.BpmConfOperationRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2021/2/3
 */
@Component
public class BpmConfOperationRepositoryImpl implements BpmConfOperationRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfOperation BpmConfOperation
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfOperation.BPM_CONF_OPERATION;

    @Override
    public int countByNodeId(String nodeId) {
        return dslContext.selectCount().from(BpmConfOperation).where(BpmConfOperation.NODE_ID.eq(nodeId)).fetchOne().value1();
    }
}
