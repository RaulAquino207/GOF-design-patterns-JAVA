package com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter._1_1_6_db;

public class _1_1_6_3_PostgresDB implements _1_1_6_1_DB {

    @Override
    public void query(String sql) {
        System.out.println("[POSTGRES] Querying " + sql + " in Oracle database");
    }

    @Override
    public void update(String sql) {
        System.out.println("[POSTGRES] Update query " + sql + " in Oracle database");
    }
}
