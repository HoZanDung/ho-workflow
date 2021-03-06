/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.ActReDeployment;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActReDeploymentRecord;

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
public class ActReDeploymentDao extends DAOImpl<ActReDeploymentRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment, String> {

    /**
     * Create a new ActReDeploymentDao without any configuration
     */
    public ActReDeploymentDao() {
        super(ActReDeployment.ACT_RE_DEPLOYMENT, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment.class);
    }

    /**
     * Create a new ActReDeploymentDao with an attached configuration
     */
    @Autowired
    public ActReDeploymentDao(Configuration configuration) {
        super(ActReDeployment.ACT_RE_DEPLOYMENT, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment object) {
        return object.getId_();
    }

    /**
     * Fetch records that have <code>id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchById_(String... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.ID_, values);
    }

    /**
     * Fetch a unique record that has <code>id_ = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment fetchOneById_(String value) {
        return fetchOne(ActReDeployment.ACT_RE_DEPLOYMENT.ID_, value);
    }

    /**
     * Fetch records that have <code>name_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByName_(String... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.NAME_, values);
    }

    /**
     * Fetch records that have <code>category_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByCategory_(String... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.CATEGORY_, values);
    }

    /**
     * Fetch records that have <code>key_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByKey_(String... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.KEY_, values);
    }

    /**
     * Fetch records that have <code>tenant_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByTenantId_(String... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.TENANT_ID_, values);
    }

    /**
     * Fetch records that have <code>deploy_time_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByDeployTime_(LocalDateTime... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.DEPLOY_TIME_, values);
    }

    /**
     * Fetch records that have <code>engine_version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByEngineVersion_(String... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.ENGINE_VERSION_, values);
    }

    /**
     * Fetch records that have <code>version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByVersion_(Integer... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.VERSION_, values);
    }

    /**
     * Fetch records that have <code>project_release_version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActReDeployment> fetchByProjectReleaseVersion_(String... values) {
        return fetch(ActReDeployment.ACT_RE_DEPLOYMENT.PROJECT_RELEASE_VERSION_, values);
    }
}
