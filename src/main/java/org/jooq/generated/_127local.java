/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.generated.tables.Demo1;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _127local extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>127local</code>
     */
    public static final _127local _127LOCAL = new _127local();

    /**
     * ces 
     */
    public final Demo1 DEMO1 = Demo1.DEMO1;

    /**
     * No further instances allowed
     */
    private _127local() {
        super("127local", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Demo1.DEMO1);
    }
}
