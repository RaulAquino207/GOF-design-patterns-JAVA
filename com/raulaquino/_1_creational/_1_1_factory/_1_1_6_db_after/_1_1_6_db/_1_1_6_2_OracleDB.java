package com.raulaquino._1_creational._1_1_factory._1_1_6_db_after._1_1_6_db;

public class _1_1_6_2_OracleDB implements _1_1_6_1_DB {

    @Override
    public void query(String sql) {
        System.out.println("[ORACLE] Querying " + sql + " in Oracle database");
    }

    @Override
    public void update(String sql) {
        System.out.println("[ORACLE] Update query " + sql + " in Oracle database");
    }
}
