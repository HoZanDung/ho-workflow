package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfForm;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfFormRecord;
import cn.com.ho.workflow.infrastructure.repositories.bpm.BpmConfFormRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2020/12/1
 */
@Component
public class BpmConfFormRepositoryImpl implements BpmConfFormRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.BpmConfForm BpmConfForm
            = cn.com.ho.workflow.infrastructure.db.tables.BpmConfForm.BPM_CONF_FORM;

    @Override
    public int insertBpmConfForm(BpmConfForm bpmConfForm) {
        BpmConfFormRecord bpmConfFormRecord = dslContext.newRecord(BpmConfForm);
        BeanUtils.copyProperties(bpmConfForm, bpmConfFormRecord);
        return bpmConfFormRecord.insert();
    }

    @Override
    public int updateBpmConfForm(BpmConfForm bpmConfForm) {
        BpmConfFormRecord bpmConfFormRecord = dslContext.newRecord(BpmConfForm);
        BeanUtils.copyProperties(bpmConfForm, bpmConfFormRecord);
        return bpmConfFormRecord.update();
    }

    @Override
    public BpmConfForm findOneByNodeId(String nodeId) {
        return dslContext
                .select().from(BpmConfForm)
                .where(BpmConfForm.NODE_ID.eq(nodeId))
                .fetchAnyInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfForm.class);
    }

    @Override
    public int countByNodeId(String nodeId) {
        return dslContext.selectCount().from(BpmConfForm).where(BpmConfForm.NODE_ID.eq(nodeId)).fetchOne().value1();
    }
}
