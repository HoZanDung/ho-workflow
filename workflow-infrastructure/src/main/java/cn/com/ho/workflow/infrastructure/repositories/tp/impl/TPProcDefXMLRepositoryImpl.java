package cn.com.ho.workflow.infrastructure.repositories.tp.impl;

import cn.com.ho.workflow.domain.entities.tp.TPProcDefXml;
import cn.com.ho.workflow.domain.repositories.tp.TPProcDefXMLRepository;
import cn.com.ho.workflow.infrastructure.db.tables.records.TPProcDefXmlRecord;
import org.jooq.DSLContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HOZANDUNG on 2021/1/28
 */
@Component
public class TPProcDefXMLRepositoryImpl implements TPProcDefXMLRepository {

    @Autowired
    private DSLContext dslContext;

    private cn.com.ho.workflow.infrastructure.db.tables.TPProcDefXml TPProcDefXml
            = cn.com.ho.workflow.infrastructure.db.tables.TPProcDefXml.T_P_PROC_DEF_XML;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertTPProcDefXml(TPProcDefXml tpProcDefXml) {
        TPProcDefXmlRecord tpProcDefXmlRecord = dslContext.newRecord(TPProcDefXml);
        BeanUtils.copyProperties(tpProcDefXml, tpProcDefXmlRecord);
        return tpProcDefXmlRecord.insert();
    }
}
