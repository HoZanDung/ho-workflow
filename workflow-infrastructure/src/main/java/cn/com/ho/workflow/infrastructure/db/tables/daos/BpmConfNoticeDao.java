/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables.daos;


import cn.com.ho.workflow.infrastructure.db.tables.BpmConfNotice;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfNoticeRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * 流程模型设置通知
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
public class BpmConfNoticeDao extends DAOImpl<BpmConfNoticeRecord, cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice, String> {

    /**
     * Create a new BpmConfNoticeDao without any configuration
     */
    public BpmConfNoticeDao() {
        super(BpmConfNotice.BPM_CONF_NOTICE, cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice.class);
    }

    /**
     * Create a new BpmConfNoticeDao with an attached configuration
     */
    @Autowired
    public BpmConfNoticeDao(Configuration configuration) {
        super(BpmConfNotice.BPM_CONF_NOTICE, cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchById(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice fetchOneById(String value) {
        return fetchOne(BpmConfNotice.BPM_CONF_NOTICE.ID, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByType(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.TYPE, values);
    }

    /**
     * Fetch records that have <code>receiver IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByReceiver(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.RECEIVER, values);
    }

    /**
     * Fetch records that have <code>due_date IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByDueDate(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.DUE_DATE, values);
    }

    /**
     * Fetch records that have <code>node_id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByNodeId(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.NODE_ID, values);
    }

    /**
     * Fetch records that have <code>template_id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByTemplateId(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.TEMPLATE_ID, values);
    }

    /**
     * Fetch records that have <code>template_code IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByTemplateCode(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.TEMPLATE_CODE, values);
    }

    /**
     * Fetch records that have <code>notification_type IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByNotificationType(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.NOTIFICATION_TYPE, values);
    }

    /**
     * Fetch records that have <code>process_model_id IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByProcessModelId(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.PROCESS_MODEL_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByStatus(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.STATUS, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByCreateTime(LocalDateTime... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByUpdateTime(LocalDateTime... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>create_by IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByCreateBy(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>update_by IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByUpdateBy(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>node_name IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByNodeName(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.NODE_NAME, values);
    }

    /**
     * Fetch records that have <code>node_code IN (values)</code>
     */
    public List<cn.com.ho.workflow.infrastructure.db.tables.pojos.BpmConfNotice> fetchByNodeCode(String... values) {
        return fetch(BpmConfNotice.BPM_CONF_NOTICE.NODE_CODE, values);
    }
}
