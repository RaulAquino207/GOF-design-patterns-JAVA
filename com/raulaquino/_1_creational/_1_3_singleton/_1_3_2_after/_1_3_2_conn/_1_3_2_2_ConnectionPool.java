package com.raulaquino._1_creational._1_3_singleton._1_3_2_after._1_3_2_conn;

import com.raulaquino._1_creational._1_3_singleton.shared.Connection;

import java.util.ArrayList;
import java.util.List;

public class _1_3_2_2_ConnectionPool {
//    private static final _1_3_2_2_ConnectionPool singleton = new _1_3_2_2_ConnectionPool();
    private static _1_3_2_2_ConnectionPool singleton = new _1_3_2_2_ConnectionPool();
    private final static int POOL_SIZE = 2;
    private final List<Connection> connectionsPool;

    private _1_3_2_2_ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++) {
            connectionsPool.add(new Connection());
        }
    }

    public static _1_3_2_2_ConnectionPool getInstance() {
        return singleton;
    }

    public Connection getConnection() {
        Connection avaiable = null;
        for(Connection conn: connectionsPool) {
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

    public void leaveConnection(Connection connection) {
        connection.removeInUse();
    }
}
