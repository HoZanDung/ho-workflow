/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.ActGeBytearray;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActGeBytearrayRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class ActGeBytearrayDao extends DAOImpl<ActGeBytearrayRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray, String> {

    /**
     * Create a new ActGeBytearrayDao without any configuration
     */
    public ActGeBytearrayDao() {
        super(ActGeBytearray.ACT_GE_BYTEARRAY, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray.class);
    }

    /**
     * Create a new ActGeBytearrayDao with an attached configuration
     */
    @Autowired
    public ActGeBytearrayDao(Configuration configuration) {
        super(ActGeBytearray.ACT_GE_BYTEARRAY, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray object) {
        return object.getId_();
    }

    /**
     * Fetch records that have <code>id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray> fetchById_(String... values) {
        return fetch(ActGeBytearray.ACT_GE_BYTEARRAY.ID_, values);
    }

    /**
     * Fetch a unique record that has <code>id_ = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray fetchOneById_(String value) {
        return fetchOne(ActGeBytearray.ACT_GE_BYTEARRAY.ID_, value);
    }

    /**
     * Fetch records that have <code>rev_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray> fetchByRev_(Integer... values) {
        return fetch(ActGeBytearray.ACT_GE_BYTEARRAY.REV_, values);
    }

    /**
     * Fetch records that have <code>name_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray> fetchByName_(String... values) {
        return fetch(ActGeBytearray.ACT_GE_BYTEARRAY.NAME_, values);
    }

    /**
     * Fetch records that have <code>deployment_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray> fetchByDeploymentId_(String... values) {
        return fetch(ActGeBytearray.ACT_GE_BYTEARRAY.DEPLOYMENT_ID_, values);
    }

    /**
     * Fetch records that have <code>bytes_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray> fetchByBytes_(byte[]... values) {
        return fetch(ActGeBytearray.ACT_GE_BYTEARRAY.BYTES_, values);
    }

    /**
     * Fetch records that have <code>generated_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActGeBytearray> fetchByGenerated_(Boolean... values) {
        return fetch(ActGeBytearray.ACT_GE_BYTEARRAY.GENERATED_, values);
    }
}
