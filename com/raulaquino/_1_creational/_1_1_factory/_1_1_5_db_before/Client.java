package com.raulaquino._1_creational._1_1_factory._1_1_5_db_before;

import com.raulaquino._1_creational._1_1_factory._1_1_5_db_before._1_1_5_db._1_1_5_OracleDB;

public class Client {
    public static void main(String[] args) {
        _1_1_5_OracleDB db = new _1_1_5_OracleDB();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
