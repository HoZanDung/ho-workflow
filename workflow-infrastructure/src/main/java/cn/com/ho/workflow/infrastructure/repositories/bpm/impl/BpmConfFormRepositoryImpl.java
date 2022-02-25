package cn.com.ho.workflow.infrastructure.repositories.bpm.impl;

import cn.com.ho.workflow.domain.entities.bpm.BpmConfForm;
import cn.com.ho.workflow.domain.repositories.bpm.BpmConfFormRepository;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfFormRecord;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional(rollbackFor = Exception.class)
    public void insertBpmConfForm(BpmConfForm bpmConfForm) {
        BpmConfFormRecord bpmConfFormRecord = dslContext.newRecord(BpmConfForm);
        BeanUtils.copyProperties(bpmConfForm, bpmConfFormRecord);
        bpmConfFormRecord.insert();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByNodeIdAndCreateBy(String nodeId, String createBy) {
        dslContext.delete(BpmConfForm).where(BpmConfForm.NODE_ID.eq(nodeId)).and(BpmConfForm.CREATE_BY.eq(createBy)).execute();
    }

    @Override
    public int countByNodeId(String nodeId) {
        return dslContext.selectCount().from(BpmConfForm).where(BpmConfForm.NODE_ID.eq(nodeId)).fetchOne().value1();
    }

    @Override
    public List<cn.com.ho.workflow.domain.entities.bpm.BpmConfForm> selectByNodeIdAndStatue(String nodeId, String status) {
        return dslContext
                .select().from(BpmConfForm)
                .where(BpmConfForm.NODE_ID.eq(nodeId))
                .and(BpmConfForm.STATUS.eq(status))
                .fetchInto(cn.com.ho.workflow.domain.entities.bpm.BpmConfForm.class);
    }
}
