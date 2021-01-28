/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.ActReModel;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActReModelRecord;

import java.time.LocalDateTime;
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
public class ActReModelDao extends DAOImpl<ActReModelRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel, String> {

    /**
     * Create a new ActReModelDao without any configuration
     */
    public ActReModelDao() {
        super(ActReModel.ACT_RE_MODEL, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel.class);
    }

    /**
     * Create a new ActReModelDao with an attached configuration
     */
    @Autowired
    public ActReModelDao(Configuration configuration) {
        super(ActReModel.ACT_RE_MODEL, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel object) {
        return object.getId_();
    }

    /**
     * Fetch records that have <code>id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchById_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.ID_, values);
    }

    /**
     * Fetch a unique record that has <code>id_ = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel fetchOneById_(String value) {
        return fetchOne(ActReModel.ACT_RE_MODEL.ID_, value);
    }

    /**
     * Fetch records that have <code>rev_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByRev_(Integer... values) {
        return fetch(ActReModel.ACT_RE_MODEL.REV_, values);
    }

    /**
     * Fetch records that have <code>name_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByName_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.NAME_, values);
    }

    /**
     * Fetch records that have <code>key_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByKey_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.KEY_, values);
    }

    /**
     * Fetch records that have <code>category_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByCategory_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.CATEGORY_, values);
    }

    /**
     * Fetch records that have <code>create_time_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByCreateTime_(LocalDateTime... values) {
        return fetch(ActReModel.ACT_RE_MODEL.CREATE_TIME_, values);
    }

    /**
     * Fetch records that have <code>last_update_time_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByLastUpdateTime_(LocalDateTime... values) {
        return fetch(ActReModel.ACT_RE_MODEL.LAST_UPDATE_TIME_, values);
    }

    /**
     * Fetch records that have <code>version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByVersion_(Integer... values) {
        return fetch(ActReModel.ACT_RE_MODEL.VERSION_, values);
    }

    /**
     * Fetch records that have <code>meta_info_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByMetaInfo_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.META_INFO_, values);
    }

    /**
     * Fetch records that have <code>deployment_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByDeploymentId_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.DEPLOYMENT_ID_, values);
    }

    /**
     * Fetch records that have <code>editor_source_value_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByEditorSourceValueId_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.EDITOR_SOURCE_VALUE_ID_, values);
    }

    /**
     * Fetch records that have <code>editor_source_extra_value_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByEditorSourceExtraValueId_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.EDITOR_SOURCE_EXTRA_VALUE_ID_, values);
    }

    /**
     * Fetch records that have <code>tenant_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReModel> fetchByTenantId_(String... values) {
        return fetch(ActReModel.ACT_RE_MODEL.TENANT_ID_, values);
    }
}
