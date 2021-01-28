package cn.com.ho.workflow.infrastructure.repositories.tp.impl;

import cn.com.ho.workflow.domain.aggregates.TPProcess;
import cn.com.ho.workflow.infrastructure.db.tables.records.TPProcessRecord;
import cn.com.ho.workflow.infrastructure.repositories.tp.TPProcessRepository;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HOZANDUNG on 2020/11/24
 */
@Component
public class TPProcessRepositoryImpl implements TPProcessRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.TPProcess TPProcess
            = cn.com.ho.workflow.infrastructure.db.tables.TPProcess.T_P_PROCESS;

    @Override
    public int insertTPProcess(TPProcess tpProcess) {
        TPProcessRecord tpProcessRecord = dslContext.newRecord(TPProcess);
        BeanUtils.copyProperties(tpProcess, tpProcessRecord);
        tpProcessRecord.setModelId(tpProcess.getModelId().getId());
        return tpProcessRecord.insert();
    }

    @Override
    public int updateTPProcess(TPProcess tpProcess) {
        TPProcessRecord tpProcessRecord = dslContext.newRecord(TPProcess);
        BeanUtils.copyProperties(tpProcess, tpProcessRecord);
        tpProcessRecord.setModelId(tpProcess.getModelId().getId());
        return tpProcessRecord.update();
    }

    @Override
    public TPProcess findOneByProcessId(String processId) {
        return dslContext
                .select().from(TPProcess)
                .where(TPProcess.ID.eq(processId))
                .fetchAnyInto(cn.com.ho.workflow.domain.aggregates.TPProcess.class);
    }

    @Override
    public TPProcess findOneByProcessKey(String processKey) {
        return dslContext
                .select().from(TPProcess)
                .where(TPProcess.PROCESS_KEY.eq(processKey))
                .fetchAnyInto(cn.com.ho.workflow.domain.aggregates.TPProcess.class);
    }

    @Override
    public cn.com.ho.workflow.domain.aggregates.TPProcess findOneByModelId(String actReModelId) {
        return dslContext
                .select().from(TPProcess)
                .where(TPProcess.MODEL_ID.eq(actReModelId))
                .fetchAnyInto(cn.com.ho.workflow.domain.aggregates.TPProcess.class);
    }
}
