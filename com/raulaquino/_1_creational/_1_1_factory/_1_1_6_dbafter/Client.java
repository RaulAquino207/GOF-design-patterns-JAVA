package com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter;

import com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter._1_1_6_db._1_1_6_1_DB;
import com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter._1_1_6_factory._1_1_6_2_OracleDBFactory;
import com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter._1_1_6_factory._1_1_6_3_PostgresDBFactory;

public class Client {
    public static void main(String[] args) {
        _1_1_6_1_DB oracleDB = new _1_1_6_2_OracleDBFactory().getDatabase();
        _1_1_6_1_DB postgres = new _1_1_6_3_PostgresDBFactory().getDatabase();

        oracleDB.query("SELECT * FROM users");
        postgres.update("INSERT INTO users VALUES ('User', 25)");
    }
}
