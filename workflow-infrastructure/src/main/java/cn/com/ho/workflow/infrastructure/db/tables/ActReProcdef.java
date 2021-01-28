/*
 * This file is generated by jOOQ.
 */
package cn.com.ho.workflow.infrastructure.db.tables;


import cn.com.ho.workflow.infrastructure.db.Indexes;
import cn.com.ho.workflow.infrastructure.db.Keys;
import cn.com.ho.workflow.infrastructure.db.Workflow;
import cn.com.ho.workflow.infrastructure.db.tables.records.ActReProcdefRecord;

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
public class ActReProcdef extends TableImpl<ActReProcdefRecord> {

    private static final long serialVersionUID = -957983588;

    /**
     * The reference instance of <code>workflow.act_re_procdef</code>
     */
    public static final ActReProcdef ACT_RE_PROCDEF = new ActReProcdef();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActReProcdefRecord> getRecordType() {
        return ActReProcdefRecord.class;
    }

    /**
     * The column <code>workflow.act_re_procdef.id_</code>.
     */
    public final TableField<ActReProcdefRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>workflow.act_re_procdef.rev_</code>.
     */
    public final TableField<ActReProcdefRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_re_procdef.category_</code>.
     */
    public final TableField<ActReProcdefRecord, String> CATEGORY_ = createField("category_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_re_procdef.name_</code>.
     */
    public final TableField<ActReProcdefRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_re_procdef.key_</code>.
     */
    public final TableField<ActReProcdefRecord, String> KEY_ = createField("key_", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>workflow.act_re_procdef.version_</code>.
     */
    public final TableField<ActReProcdefRecord, Integer> VERSION_ = createField("version_", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>workflow.act_re_procdef.deployment_id_</code>.
     */
    public final TableField<ActReProcdefRecord, String> DEPLOYMENT_ID_ = createField("deployment_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>workflow.act_re_procdef.resource_name_</code>.
     */
    public final TableField<ActReProcdefRecord, String> RESOURCE_NAME_ = createField("resource_name_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>workflow.act_re_procdef.dgrm_resource_name_</code>.
     */
    public final TableField<ActReProcdefRecord, String> DGRM_RESOURCE_NAME_ = createField("dgrm_resource_name_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>workflow.act_re_procdef.description_</code>.
     */
    public final TableField<ActReProcdefRecord, String> DESCRIPTION_ = createField("description_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>workflow.act_re_procdef.has_start_form_key_</code>.
     */
    public final TableField<ActReProcdefRecord, Boolean> HAS_START_FORM_KEY_ = createField("has_start_form_key_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_re_procdef.has_graphical_notation_</code>.
     */
    public final TableField<ActReProcdefRecord, Boolean> HAS_GRAPHICAL_NOTATION_ = createField("has_graphical_notation_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>workflow.act_re_procdef.suspension_state_</code>.
     */
    public final TableField<ActReProcdefRecord, Integer> SUSPENSION_STATE_ = createField("suspension_state_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>workflow.act_re_procdef.tenant_id_</code>.
     */
    public final TableField<ActReProcdefRecord, String> TENANT_ID_ = createField("tenant_id_", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>workflow.act_re_procdef.engine_version_</code>.
     */
    public final TableField<ActReProcdefRecord, String> ENGINE_VERSION_ = createField("engine_version_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>workflow.act_re_procdef.app_version_</code>.
     */
    public final TableField<ActReProcdefRecord, Integer> APP_VERSION_ = createField("app_version_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>workflow.act_re_procdef</code> table reference
     */
    public ActReProcdef() {
        this(DSL.name("act_re_procdef"), null);
    }

    /**
     * Create an aliased <code>workflow.act_re_procdef</code> table reference
     */
    public ActReProcdef(String alias) {
        this(DSL.name(alias), ACT_RE_PROCDEF);
    }

    /**
     * Create an aliased <code>workflow.act_re_procdef</code> table reference
     */
    public ActReProcdef(Name alias) {
        this(alias, ACT_RE_PROCDEF);
    }

    private ActReProcdef(Name alias, Table<ActReProcdefRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActReProcdef(Name alias, Table<ActReProcdefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ActReProcdef(Table<O> child, ForeignKey<O, ActReProcdefRecord> key) {
        super(child, key, ACT_RE_PROCDEF);
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
        return Arrays.<Index>asList(Indexes.ACT_RE_PROCDEF_PKEY, Indexes.ACT_UNIQ_PROCDEF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActReProcdefRecord> getPrimaryKey() {
        return Keys.ACT_RE_PROCDEF_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActReProcdefRecord>> getKeys() {
        return Arrays.<UniqueKey<ActReProcdefRecord>>asList(Keys.ACT_RE_PROCDEF_PKEY, Keys.ACT_UNIQ_PROCDEF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReProcdef as(String alias) {
        return new ActReProcdef(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActReProcdef as(Name alias) {
        return new ActReProcdef(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActReProcdef rename(String name) {
        return new ActReProcdef(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActReProcdef rename(Name name) {
        return new ActReProcdef(name, null);
    }
}
