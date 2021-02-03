package cn.com.ho.workflow.infrastructure.repositories.tp.impl;

import cn.com.ho.workflow.domain.aggregates.ActReModelId;
import cn.com.ho.workflow.domain.aggregates.ProcessModelId;
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
    public int deleteTPProcessByActReModelId(String actReModelId) {
        return dslContext.delete(TPProcess).where(TPProcess.MODEL_ID.eq(actReModelId)).execute();
    }

    @Override
    public TPProcess findOneByProcessId(String processId) {
        cn.com.ho.workflow.infrastructure.db.tables.pojos.TPProcess tpProcess = dslContext
                .select().from(TPProcess)
                .where(TPProcess.ID.eq(processId))
                .fetchAnyInto(cn.com.ho.workflow.infrastructure.db.tables.pojos.TPProcess.class);
        return getReturnTPProcess(tpProcess);
    }

    @Override
    public TPProcess findOneByProcessKey(String processKey) {
        cn.com.ho.workflow.infrastructure.db.tables.pojos.TPProcess tpProcess = dslContext
                .select().from(TPProcess)
                .where(TPProcess.PROCESS_KEY.eq(processKey))
                .fetchAnyInto(cn.com.ho.workflow.infrastructure.db.tables.pojos.TPProcess.class);
        return getReturnTPProcess(tpProcess);
    }

    @Override
    public TPProcess findOneByModelId(String actReModelId) {
        cn.com.ho.workflow.infrastructure.db.tables.pojos.TPProcess tpProcess = dslContext
                .select().from(TPProcess)
                .where(TPProcess.MODEL_ID.eq(actReModelId))
                .fetchAnyInto(cn.com.ho.workflow.infrastructure.db.tables.pojos.TPProcess.class);
        return getReturnTPProcess(tpProcess);
    }

    private TPProcess getReturnTPProcess(cn.com.ho.workflow.infrastructure.db.tables.pojos.TPProcess tpProcess) {
        cn.com.ho.workflow.domain.aggregates.TPProcess process = new TPProcess();
        if (tpProcess != null) {
            BeanUtils.copyProperties(tpProcess, process);
            process.setProcessModelId(new ProcessModelId(tpProcess.getId()));
            process.setModelId(new ActReModelId(tpProcess.getModelId()));
        }
        return process;
    }
}
