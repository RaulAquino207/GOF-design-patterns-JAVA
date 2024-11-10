package com.raulaquino._1_creational._1_3_singleton._1_3_3_monostate;

import com.raulaquino._1_creational._1_3_singleton._1_3_3_monostate._1_3_3_conn._1_3_3_1_ConnectionPool;
import com.raulaquino._1_creational._1_3_singleton.shared.Connection;

public class Client {

    public static void doQuery1() {
        _1_3_3_1_ConnectionPool pool = new _1_3_3_1_ConnectionPool();
        Connection conn = pool.getConnection();

        if(conn != null) {
            conn.query("SELECT * FROM A1");
        }
    }

    public static void doQuery2() {
        _1_3_3_1_ConnectionPool pool = new _1_3_3_1_ConnectionPool();
        Connection conn = pool.getConnection();

        if(conn != null) {
            conn.query("SELECT * FROM A2");
        }
    }

    public static void doQuery3() {
        _1_3_3_1_ConnectionPool pool = new _1_3_3_1_ConnectionPool();
        Connection conn = pool.getConnection();

        if(conn != null) {
            conn.query("SELECT * FROM A3");
        }
    }

    public static void main(String[] args) {
        Client.doQuery1();
        Client.doQuery2();
        Client.doQuery3();
    }
}
