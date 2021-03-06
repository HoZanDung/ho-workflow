/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.TaskDefListener;
import cn.com.ho.workflow.infrastructure.db.tables.records.TaskDefListenerRecord;

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
public class TaskDefListenerDao extends DAOImpl<TaskDefListenerRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener, String> {

    /**
     * Create a new TaskDefListenerDao without any configuration
     */
    public TaskDefListenerDao() {
        super(TaskDefListener.TASK_DEF_LISTENER, cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener.class);
    }

    /**
     * Create a new TaskDefListenerDao with an attached configuration
     */
    @Autowired
    public TaskDefListenerDao(Configuration configuration) {
        super(TaskDefListener.TASK_DEF_LISTENER, cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchById(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener fetchOneById(String value) {
        return fetchOne(TaskDefListener.TASK_DEF_LISTENER.ID, value);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByValue(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.VALUE, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByType(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.TYPE, values);
    }

    /**
     * Fetch records that have <code>base_id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByBaseId(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.BASE_ID, values);
    }

    /**
     * Fetch records that have <code>process_definition_id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByProcessDefinitionId(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.PROCESS_DEFINITION_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByStatus(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.STATUS, values);
    }

    /**
     * Fetch records that have <code>node_code IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByNodeCode(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.NODE_CODE, values);
    }

    /**
     * Fetch records that have <code>ext_status IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByExtStatus(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.EXT_STATUS, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByCreateTime(LocalDateTime... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_by IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByCreateBy(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>update_by IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByUpdateBy(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>node_name IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByNodeName(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.NODE_NAME, values);
    }

    /**
     * Fetch records that have <code>bean_name IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.TaskDefListener> fetchByBeanName(String... values) {
        return fetch(TaskDefListener.TASK_DEF_LISTENER.BEAN_NAME, values);
    }
}
