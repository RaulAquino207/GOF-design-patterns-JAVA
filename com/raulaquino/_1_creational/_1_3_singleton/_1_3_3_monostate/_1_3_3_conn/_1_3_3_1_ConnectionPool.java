package com.raulaquino._1_creational._1_3_singleton._1_3_3_monostate._1_3_3_conn;

import com.raulaquino._1_creational._1_3_singleton.shared.Connection;

import java.util.ArrayList;
import java.util.List;

public class _1_3_3_1_ConnectionPool {
    public final static int POOL_SIZE = 2;
    private static final List<Connection> connectionsPool;

    static {
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++) {
            Connection conn = new Connection();
            connectionsPool.add(conn);
        }
    }

    public _1_3_3_1_ConnectionPool() {
        System.out.println("New instance of Connection Pool");
    }

    public Connection getConnection() {
        Connection avaiable = null;

        System.out.println(connectionsPool.size());
        for (Connection conn: connectionsPool) {
            if (conn.isInUse()) {
                avaiable = conn;
                avaiable.putInUse();
                break;
            }
        }

        if (avaiable == null) {
            System.out.println("No connections avaiable");
            return null;
        }

        return avaiable;
    }

    public void leaveConnection(Connection connection) {
        connection.removeInUse();
    }
}
