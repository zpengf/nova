/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.generated.tables.Demo1;
import org.jooq.generated.tables.interfaces.IDemo1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * ces 
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Demo1Record extends UpdatableRecordImpl<Demo1Record> implements Record2<Integer, String>, IDemo1 {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>127local.demo1.id</code>.
     */
    @Override
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>127local.demo1.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>127local.demo1.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>127local.demo1.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Demo1.DEMO1.ID;
    }

    @Override
    public Field<String> field2() {
        return Demo1.DEMO1.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Demo1Record value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public Demo1Record value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public Demo1Record values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IDemo1 from) {
        setId(from.getId());
        setName(from.getName());
    }

    @Override
    public <E extends IDemo1> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Demo1Record
     */
    public Demo1Record() {
        super(Demo1.DEMO1);
    }

    /**
     * Create a detached, initialised Demo1Record
     */
    public Demo1Record(Integer id, String name) {
        super(Demo1.DEMO1);

        setId(id);
        setName(name);
    }
}
