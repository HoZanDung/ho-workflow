/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.TaskDefUser;
import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefUserRecord;

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
public class TaskDefUserDao extends DAOImpl<TaskDefUserRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser, String> {

    /**
     * Create a new TaskDefUserDao without any configuration
     */
    public TaskDefUserDao() {
        super(TaskDefUser.TASK_DEF_USER, cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser.class);
    }

    /**
     * Create a new TaskDefUserDao with an attached configuration
     */
    @Autowired
    public TaskDefUserDao(Configuration configuration) {
        super(TaskDefUser.TASK_DEF_USER, cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchById(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser fetchOneById(String value) {
        return fetchOne(TaskDefUser.TASK_DEF_USER.ID, value);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByValue(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.VALUE, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByType(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.TYPE, values);
    }

    /**
     * Fetch records that have <code>catalog IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByCatalog(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.CATALOG, values);
    }

    /**
     * Fetch records that have <code>base_id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByBaseId(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.BASE_ID, values);
    }

    /**
     * Fetch records that have <code>process_definition_id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByProcessDefinitionId(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.PROCESS_DEFINITION_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByStatus(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.STATUS, values);
    }

    /**
     * Fetch records that have <code>node_code IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByNodeCode(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.NODE_CODE, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByCreateTime(LocalDateTime... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_by IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByCreateBy(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>update_by IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByUpdateBy(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>expr_user IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByExprUser(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.EXPR_USER, values);
    }

    /**
     * Fetch records that have <code>is_depart IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByIsDepart(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.IS_DEPART, values);
    }

    /**
     * Fetch records that have <code>node_name IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByNodeName(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.NODE_NAME, values);
    }

    /**
     * Fetch records that have <code>priority IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByPriority(Integer... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.PRIORITY, values);
    }

    /**
     * Fetch records that have <code>depart_level IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByDepartLevel(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.DEPART_LEVEL, values);
    }

    /**
     * Fetch records that have <code>val_cn IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByValCn(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.VAL_CN, values);
    }

    /**
     * Fetch records that have <code>value_text IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefUser> fetchByValueText(String... values) {
        return fetch(TaskDefUser.TASK_DEF_USER.VALUE_TEXT, values);
    }
}
