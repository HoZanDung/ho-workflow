/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.ActRuTask;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActRuTaskRecord;

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
public class ActRuTaskDao extends DAOImpl<ActRuTaskRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask, String> {

    /**
     * Create a new ActRuTaskDao without any configuration
     */
    public ActRuTaskDao() {
        super(ActRuTask.ACT_RU_TASK, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask.class);
    }

    /**
     * Create a new ActRuTaskDao with an attached configuration
     */
    @Autowired
    public ActRuTaskDao(Configuration configuration) {
        super(ActRuTask.ACT_RU_TASK, cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask object) {
        return object.getId_();
    }

    /**
     * Fetch records that have <code>id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchById_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.ID_, values);
    }

    /**
     * Fetch a unique record that has <code>id_ = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask fetchOneById_(String value) {
        return fetchOne(ActRuTask.ACT_RU_TASK.ID_, value);
    }

    /**
     * Fetch records that have <code>rev_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByRev_(Integer... values) {
        return fetch(ActRuTask.ACT_RU_TASK.REV_, values);
    }

    /**
     * Fetch records that have <code>execution_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByExecutionId_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.EXECUTION_ID_, values);
    }

    /**
     * Fetch records that have <code>proc_inst_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByProcInstId_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.PROC_INST_ID_, values);
    }

    /**
     * Fetch records that have <code>proc_def_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByProcDefId_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.PROC_DEF_ID_, values);
    }

    /**
     * Fetch records that have <code>name_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByName_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.NAME_, values);
    }

    /**
     * Fetch records that have <code>business_key_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByBusinessKey_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.BUSINESS_KEY_, values);
    }

    /**
     * Fetch records that have <code>parent_task_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByParentTaskId_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.PARENT_TASK_ID_, values);
    }

    /**
     * Fetch records that have <code>description_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByDescription_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.DESCRIPTION_, values);
    }

    /**
     * Fetch records that have <code>task_def_key_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByTaskDefKey_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.TASK_DEF_KEY_, values);
    }

    /**
     * Fetch records that have <code>owner_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByOwner_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.OWNER_, values);
    }

    /**
     * Fetch records that have <code>assignee_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByAssignee_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.ASSIGNEE_, values);
    }

    /**
     * Fetch records that have <code>delegation_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByDelegation_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.DELEGATION_, values);
    }

    /**
     * Fetch records that have <code>priority_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByPriority_(Integer... values) {
        return fetch(ActRuTask.ACT_RU_TASK.PRIORITY_, values);
    }

    /**
     * Fetch records that have <code>create_time_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByCreateTime_(LocalDateTime... values) {
        return fetch(ActRuTask.ACT_RU_TASK.CREATE_TIME_, values);
    }

    /**
     * Fetch records that have <code>due_date_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByDueDate_(LocalDateTime... values) {
        return fetch(ActRuTask.ACT_RU_TASK.DUE_DATE_, values);
    }

    /**
     * Fetch records that have <code>category_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByCategory_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.CATEGORY_, values);
    }

    /**
     * Fetch records that have <code>suspension_state_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchBySuspensionState_(Integer... values) {
        return fetch(ActRuTask.ACT_RU_TASK.SUSPENSION_STATE_, values);
    }

    /**
     * Fetch records that have <code>tenant_id_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByTenantId_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.TENANT_ID_, values);
    }

    /**
     * Fetch records that have <code>form_key_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByFormKey_(String... values) {
        return fetch(ActRuTask.ACT_RU_TASK.FORM_KEY_, values);
    }

    /**
     * Fetch records that have <code>claim_time_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByClaimTime_(LocalDateTime... values) {
        return fetch(ActRuTask.ACT_RU_TASK.CLAIM_TIME_, values);
    }

    /**
     * Fetch records that have <code>app_version_ IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.ActRuTask> fetchByAppVersion_(Integer... values) {
        return fetch(ActRuTask.ACT_RU_TASK.APP_VERSION_, values);
    }
}
