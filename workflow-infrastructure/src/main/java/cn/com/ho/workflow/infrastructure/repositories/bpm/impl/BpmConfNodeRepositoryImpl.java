package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfNode;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfNodeRecord;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfNodeRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
@Component
public class BpmConfNodeRepositoryImpl implements BpmConfNodeRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfNode BpmConfNode
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfNode.BPM_CONF_NODE;

    @Override
    public int insertBpmConfNode(BpmConfNode bpmConfNode) {
        BpmConfNodeRecord bpmConfNodeRecord = dslContext.newRecord(BpmConfNode);
        BeanUtils.copyProperties(bpmConfNode, bpmConfNodeRecord);
        return bpmConfNodeRecord.insert();
    }

    @Override
    public int updateBpmConfNode(BpmConfNode bpmConfNode) {
        BpmConfNodeRecord bpmConfNodeRecord = dslContext.newRecord(BpmConfNode);
        BeanUtils.copyProperties(bpmConfNode, bpmConfNodeRecord);
        return bpmConfNodeRecord.update();
    }

    @Override
    public BpmConfNode findOneByCodeAndConfBaseId(String code, String confBaseId) {
        return dslContext
                .select().from(BpmConfNode)
                .where(BpmConfNode.CODE.eq(code))
                .and(BpmConfNode.CONF_BASE_ID.eq(confBaseId))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfNode.class);
    }

    @Override
    public List<cn.com.ho.workflow.domain.entities.bpm.BpmConfNode> selectByConfBaseId(String confBaseId) {
        return dslContext
                .select().from(BpmConfNode)
                .where(BpmConfNode.CONF_BASE_ID.eq(confBaseId))
                .fetchInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfNode.class);
    }
}
