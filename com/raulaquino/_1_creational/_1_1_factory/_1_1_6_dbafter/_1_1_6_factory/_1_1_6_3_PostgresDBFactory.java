package com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter._1_1_6_factory;

import com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter._1_1_6_db._1_1_6_1_DB;
import com.raulaquino._1_creational._1_1_factory._1_1_6_dbafter._1_1_6_db._1_1_6_3_PostgresDB;

public class _1_1_6_3_PostgresDBFactory implements _1_1_6_1_DBFactory{
    @Override
    public _1_1_6_1_DB getDatabase() {
        return new _1_1_6_3_PostgresDB();
    }
}
