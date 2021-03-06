/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables;


import cn.com.ho.workflow.infrastructure.db.Indexes;
import cn.com.ho.workflow.infrastructure.db.Keys;
import cn.com.ho.workflow.infrastructure.db.Workflow;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActProcdefInfoRecord;

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
public class ActProcdefInfo extends TableImpl<ActProcdefInfoRecord> {

    private static final long serialVersionUID = -1831451926;

    /**
     * The reference instance of <code>workflow.act_procdef_info</code>
     */
    public static final ActProcdefInfo ACT_PROCDEF_INFO = new ActProcdefInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActProcdefInfoRecord> getRecordType() {
        return ActProcdefInfoRecord.class;
    }

    /**
     * The column <code>workflow.act_procdef_info.id_</code>.
     */
    public final TableField<ActProcdefInfoRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_procdef_info.proc_def_id_</code>.
     */
    public final TableField<ActProcdefInfoRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_procdef_info.rev_</code>.
     */
    public final TableField<ActProcdefInfoRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_procdef_info.info_json_id_</code>.
     */
    public final TableField<ActProcdefInfoRecord, String> INFO_JSON_ID_ = createField("info_json_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>workflow.act_procdef_info</code> table reference
     */
    public ActProcdefInfo() {
        this(DSL.name("act_procdef_info"), null);
    }

    /**
     * Create an aliased <code>workflow.act_procdef_info</code> table reference
     */
    public ActProcdefInfo(String alias) {
        this(DSL.name(alias), ACT_PROCDEF_INFO);
    }

    /**
     * Create an aliased <code>workflow.act_procdef_info</code> table reference
     */
    public ActProcdefInfo(Name alias) {
        this(alias, ACT_PROCDEF_INFO);
    }

    private ActProcdefInfo(Name alias, Table<ActProcdefInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActProcdefInfo(Name alias, Table<ActProcdefInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ActProcdefInfo(Table<O> child, ForeignKey<O, ActProcdefInfoRecord> key) {
        super(child, key, ACT_PROCDEF_INFO);
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
        return Arrays.<Index>asList(Indexes.ACT_IDX_PROCDEF_INFO_JSON, Indexes.ACT_IDX_PROCDEF_INFO_PROC, Indexes.ACT_PROCDEF_INFO_PKEY, Indexes.ACT_UNIQ_INFO_PROCDEF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActProcdefInfoRecord> getPrimaryKey() {
        return Keys.ACT_PROCDEF_INFO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActProcdefInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<ActProcdefInfoRecord>>asList(Keys.ACT_PROCDEF_INFO_PKEY, Keys.ACT_UNIQ_INFO_PROCDEF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ActProcdefInfoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ActProcdefInfoRecord, ?>>asList(Keys.ACT_PROCDEF_INFO__ACT_FK_INFO_PROCDEF, Keys.ACT_PROCDEF_INFO__ACT_FK_INFO_JSON_BA);
    }

    public ActReProcdef actReProcdef() {
        return new ActReProcdef(this, Keys.ACT_PROCDEF_INFO__ACT_FK_INFO_PROCDEF);
    }

    public ActGeBytearray actGeBytearray() {
        return new ActGeBytearray(this, Keys.ACT_PROCDEF_INFO__ACT_FK_INFO_JSON_BA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActProcdefInfo as(String alias) {
        return new ActProcdefInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActProcdefInfo as(Name alias) {
        return new ActProcdefInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActProcdefInfo rename(String name) {
        return new ActProcdefInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActProcdefInfo rename(Name name) {
        return new ActProcdefInfo(name, null);
    }
}
