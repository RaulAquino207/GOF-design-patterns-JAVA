package com.raulaquino._1_creational._1_3_singleton._1_3_2_after._1_3_2_conn;

import com.raulaquino._1_creational._1_3_singleton._1_3_1_before._1_3_1_conn._1_3_1_1_Connection;

import java.util.ArrayList;
import java.util.List;

public class _1_3_2_2_ConnectionPool {
//    private static final _1_3_2_2_ConnectionPool singleton = new _1_3_2_2_ConnectionPool();
    private static _1_3_2_2_ConnectionPool singleton = new _1_3_2_2_ConnectionPool();
    private final static int POOL_SIZE = 2;
    private final List<_1_3_1_1_Connection> connectionsPool;

    private _1_3_2_2_ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<_1_3_1_1_Connection>();
        for(int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new _1_3_1_1_Connection());
        }
    }

    public static _1_3_2_2_ConnectionPool getInstance() {
        return singleton;
    }

    public _1_3_1_1_Connection getConnection() {
        _1_3_1_1_Connection avaiable = null;
        for(_1_3_1_1_Connection conn: connectionsPool) {
            if(conn.isInUse()) {
                avaiable = conn;
                break;
            }
        }

        if (avaiable == null) {
            System.out.println("No connections avaiable");
            return null;
        }

        avaiable.putInUse();
        return avaiable;
    }

    public void leaveConnection(_1_3_1_1_Connection connection) {
        connection.removeInUse();
    }
}
