/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables;


import cn.com.ho.workflow.infrastructure.db.Indexes;
import cn.com.ho.workflow.infrastructure.db.Keys;
import cn.com.ho.workflow.infrastructure.db.Workflow;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActHiProcinstRecord;

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
public class ActHiProcinst extends TableImpl<ActHiProcinstRecord> {

    private static final long serialVersionUID = -1845674095;

    /**
     * The reference instance of <code>workflow.act_hi_procinst</code>
     */
    public static final ActHiProcinst ACT_HI_PROCINST = new ActHiProcinst();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActHiProcinstRecord> getRecordType() {
        return ActHiProcinstRecord.class;
    }

    /**
     * The column <code>workflow.act_hi_procinst.id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.proc_inst_id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.business_key_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> BUSINESS_KEY_ = createField("business_key_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.proc_def_id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.start_time_</code>.
     */
    public final TableField<ActHiProcinstRecord, LocalDateTime> START_TIME_ = createField("start_time_", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.end_time_</code>.
     */
    public final TableField<ActHiProcinstRecord, LocalDateTime> END_TIME_ = createField("end_time_", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>workflow.act_hi_procinst.duration_</code>.
     */
    public final TableField<ActHiProcinstRecord, Long> DURATION_ = createField("duration_", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>workflow.act_hi_procinst.start_user_id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> START_USER_ID_ = createField("start_user_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.start_act_id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> START_ACT_ID_ = createField("start_act_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.end_act_id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> END_ACT_ID_ = createField("end_act_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.super_process_instance_id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> SUPER_PROCESS_INSTANCE_ID_ = createField("super_process_instance_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.delete_reason_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> DELETE_REASON_ = createField("delete_reason_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.tenant_id_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> TENANT_ID_ = createField("tenant_id_", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>workflow.act_hi_procinst.name_</code>.
     */
    public final TableField<ActHiProcinstRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>workflow.act_hi_procinst</code> table reference
     */
    public ActHiProcinst() {
        this(DSL.name("act_hi_procinst"), null);
    }

    /**
     * Create an aliased <code>workflow.act_hi_procinst</code> table reference
     */
    public ActHiProcinst(String alias) {
        this(DSL.name(alias), ACT_HI_PROCINST);
    }

    /**
     * Create an aliased <code>workflow.act_hi_procinst</code> table reference
     */
    public ActHiProcinst(Name alias) {
        this(alias, ACT_HI_PROCINST);
    }

    private ActHiProcinst(Name alias, Table<ActHiProcinstRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActHiProcinst(Name alias, Table<ActHiProcinstRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ActHiProcinst(Table<O> child, ForeignKey<O, ActHiProcinstRecord> key) {
        super(child, key, ACT_HI_PROCINST);
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
        return Arrays.<Index>asList(Indexes.ACT_HI_PROCINST_PKEY, Indexes.ACT_HI_PROCINST_PROC_INST_ID__KEY, Indexes.ACT_IDX_HI_PRO_I_BUSKEY, Indexes.ACT_IDX_HI_PRO_INST_END);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActHiProcinstRecord> getPrimaryKey() {
        return Keys.ACT_HI_PROCINST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActHiProcinstRecord>> getKeys() {
        return Arrays.<UniqueKey<ActHiProcinstRecord>>asList(Keys.ACT_HI_PROCINST_PKEY, Keys.ACT_HI_PROCINST_PROC_INST_ID__KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiProcinst as(String alias) {
        return new ActHiProcinst(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiProcinst as(Name alias) {
        return new ActHiProcinst(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiProcinst rename(String name) {
        return new ActHiProcinst(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiProcinst rename(Name name) {
        return new ActHiProcinst(name, null);
    }
}
