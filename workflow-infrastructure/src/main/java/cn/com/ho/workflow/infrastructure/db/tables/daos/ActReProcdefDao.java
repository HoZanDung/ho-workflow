/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.ActReProcdef;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActReProcdefRecord;

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
public class ActReProcdefDao extends DAOImpl<ActReProcdefRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef, String> {

    /**
     * Create a new ActReProcdefDao without any configuration
     */
    public ActReProcdefDao() {
        super(ActReProcdef.ACT_RE_PROCDEF, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef.class);
    }

    /**
     * Create a new ActReProcdefDao with an attached configuration
     */
    @Autowired
    public ActReProcdefDao(Configuration configuration) {
        super(ActReProcdef.ACT_RE_PROCDEF, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef object) {
        return object.getId_();
    }

    /**
     * Fetch records that have <code>id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchById_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.ID_, values);
    }

    /**
     * Fetch a unique record that has <code>id_ = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef fetchOneById_(String value) {
        return fetchOne(ActReProcdef.ACT_RE_PROCDEF.ID_, value);
    }

    /**
     * Fetch records that have <code>rev_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByRev_(Integer... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.REV_, values);
    }

    /**
     * Fetch records that have <code>category_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByCategory_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.CATEGORY_, values);
    }

    /**
     * Fetch records that have <code>name_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByName_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.NAME_, values);
    }

    /**
     * Fetch records that have <code>key_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByKey_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.KEY_, values);
    }

    /**
     * Fetch records that have <code>version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByVersion_(Integer... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.VERSION_, values);
    }

    /**
     * Fetch records that have <code>deployment_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByDeploymentId_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.DEPLOYMENT_ID_, values);
    }

    /**
     * Fetch records that have <code>resource_name_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByResourceName_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.RESOURCE_NAME_, values);
    }

    /**
     * Fetch records that have <code>dgrm_resource_name_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByDgrmResourceName_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.DGRM_RESOURCE_NAME_, values);
    }

    /**
     * Fetch records that have <code>description_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByDescription_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.DESCRIPTION_, values);
    }

    /**
     * Fetch records that have <code>has_start_form_key_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByHasStartFormKey_(Boolean... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.HAS_START_FORM_KEY_, values);
    }

    /**
     * Fetch records that have <code>has_graphical_notation_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByHasGraphicalNotation_(Boolean... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.HAS_GRAPHICAL_NOTATION_, values);
    }

    /**
     * Fetch records that have <code>suspension_state_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchBySuspensionState_(Integer... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.SUSPENSION_STATE_, values);
    }

    /**
     * Fetch records that have <code>tenant_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByTenantId_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.TENANT_ID_, values);
    }

    /**
     * Fetch records that have <code>engine_version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByEngineVersion_(String... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.ENGINE_VERSION_, values);
    }

    /**
     * Fetch records that have <code>app_version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReProcdef> fetchByAppVersion_(Integer... values) {
        return fetch(ActReProcdef.ACT_RE_PROCDEF.APP_VERSION_, values);
    }
}
