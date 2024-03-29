/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables;


import cn.com.ho.workflow.infrastructure.db.Indexes;
import cn.com.ho.workflow.infrastructure.db.Keys;
import cn.com.ho.workflow.infrastructure.db.Workflow;
import cn.com.ho.workflow.infrastructure.db.tables.records.BpmConfNodeRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class BpmConfNode extends TableImpl<BpmConfNodeRecord> {

    private static final long serialVersionUID = 1437600627;

    /**
     * The reference instance of <code>workflow.bpm_conf_node</code>
     */
    public static final BpmConfNode BPM_CONF_NODE = new BpmConfNode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BpmConfNodeRecord> getRecordType() {
        return BpmConfNodeRecord.class;
    }

    /**
     * The column <code>workflow.bpm_conf_node.id</code>.
     */
    public final TableField<BpmConfNodeRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>workflow.bpm_conf_node.code</code>.
     */
    public final TableField<BpmConfNodeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.name</code>.
     */
    public final TableField<BpmConfNodeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.type</code>.
     */
    public final TableField<BpmConfNodeRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.conf_user</code>.
     */
    public final TableField<BpmConfNodeRecord, Integer> CONF_USER = createField("conf_user", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.conf_listener</code>.
     */
    public final TableField<BpmConfNodeRecord, Integer> CONF_LISTENER = createField("conf_listener", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.conf_rule</code>.
     */
    public final TableField<BpmConfNodeRecord, Integer> CONF_RULE = createField("conf_rule", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.conf_form</code>.
     */
    public final TableField<BpmConfNodeRecord, Integer> CONF_FORM = createField("conf_form", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.conf_operation</code>.
     */
    public final TableField<BpmConfNodeRecord, Integer> CONF_OPERATION = createField("conf_operation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.conf_notice</code>.
     */
    public final TableField<BpmConfNodeRecord, Integer> CONF_NOTICE = createField("conf_notice", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.priority</code>.
     */
    public final TableField<BpmConfNodeRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.conf_base_id</code>.
     */
    public final TableField<BpmConfNodeRecord, String> CONF_BASE_ID = createField("conf_base_id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.skip</code>.
     */
    public final TableField<BpmConfNodeRecord, String> SKIP = createField("skip", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.status</code>.
     */
    public final TableField<BpmConfNodeRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.create_time</code>.
     */
    public final TableField<BpmConfNodeRecord, LocalDateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.update_time</code>.
     */
    public final TableField<BpmConfNodeRecord, LocalDateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.create_by</code>.
     */
    public final TableField<BpmConfNodeRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.update_by</code>.
     */
    public final TableField<BpmConfNodeRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.skip_node_expr</code>.
     */
    public final TableField<BpmConfNodeRecord, String> SKIP_NODE_EXPR = createField("skip_node_expr", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.user_dept_role</code>.
     */
    public final TableField<BpmConfNodeRecord, String> USER_DEPT_ROLE = createField("user_dept_role", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.grab_order</code>.
     */
    public final TableField<BpmConfNodeRecord, String> GRAB_ORDER = createField("grab_order", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>workflow.bpm_conf_node.model_name</code>.
     */
    public final TableField<BpmConfNodeRecord, String> MODEL_NAME = createField("model_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>workflow.bpm_conf_node</code> table reference
     */
    public BpmConfNode() {
        this(DSL.name("bpm_conf_node"), null);
    }

    /**
     * Create an aliased <code>workflow.bpm_conf_node</code> table reference
     */
    public BpmConfNode(String alias) {
        this(DSL.name(alias), BPM_CONF_NODE);
    }

    /**
     * Create an aliased <code>workflow.bpm_conf_node</code> table reference
     */
    public BpmConfNode(Name alias) {
        this(alias, BPM_CONF_NODE);
    }

    private BpmConfNode(Name alias, Table<BpmConfNodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private BpmConfNode(Name alias, Table<BpmConfNodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BpmConfNode(Table<O> child, ForeignKey<O, BpmConfNodeRecord> key) {
        super(child, key, BPM_CONF_NODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Workflow.WORKFLOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BPM_CONF_NODE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BpmConfNodeRecord> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_BPM_CONF_NODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BpmConfNodeRecord>> getKeys() {
        return Arrays.<UniqueKey<BpmConfNodeRecord>>asList(Keys.BPM_CONF_NODE_PK, Keys.SYNTHETIC_PK_BPM_CONF_NODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNode as(String alias) {
        return new BpmConfNode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BpmConfNode as(Name alias) {
        return new BpmConfNode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BpmConfNode rename(String name) {
        return new BpmConfNode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BpmConfNode rename(Name name) {
        return new BpmConfNode(name, null);
    }
}
