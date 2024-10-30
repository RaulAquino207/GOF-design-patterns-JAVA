package com.raulaquino._1_creational._1_1_factory._1_1_5_dbbefore._1_1_5_db;

public class _1_1_5_OracleDB {
    public void query(String sql) {
        System.out.println("Querying " + sql + " in Oracle database");
    }

    public void update(String sql) {
        System.out.println("Update query " + sql + " in Oracle database");
    }
}
