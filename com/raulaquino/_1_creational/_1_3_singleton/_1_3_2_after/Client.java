package com.raulaquino._1_creational._1_3_singleton._1_3_2_after;

import com.raulaquino._1_creational._1_3_singleton.shared.Connection;
import com.raulaquino._1_creational._1_3_singleton._1_3_2_after._1_3_2_conn._1_3_2_2_ConnectionPool;

public class Client {
    public static void doQuery1() {
        _1_3_2_2_ConnectionPool pool = _1_3_2_2_ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        if(conn != null) {
            conn.query("SELECT * FROM A1");
        }
    }

    public static void doQuery2() {
        _1_3_2_2_ConnectionPool pool = _1_3_2_2_ConnectionPool.getInstance();
        Connection conn = pool.getConnection();

        if(conn != null) {
            conn.query("SELECT * FROM A2");
        }
//        conn.removeInUse();
    }

    public static void doQuery3() {
        _1_3_2_2_ConnectionPool pool = _1_3_2_2_ConnectionPool.getInstance();
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
