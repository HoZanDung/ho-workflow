package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.repositories.bpm.BpmConfRuleRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2021/2/3
 */
@Component
public class BpmConfRuleRepositoryImpl implements BpmConfRuleRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfRule BpmConfRule
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfRule.BPM_CONF_RULE;

    @Override
    public int countByNodeId(String nodeId) {
        return dslContext.selectCount().from(BpmConfRule).where(BpmConfRule.NODE_ID.eq(nodeId)).fetchOne().value1();
    }
}
