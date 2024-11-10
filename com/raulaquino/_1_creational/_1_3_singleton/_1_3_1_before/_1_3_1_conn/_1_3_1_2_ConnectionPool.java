package com.raulaquino._1_creational._1_3_singleton._1_3_1_before._1_3_1_conn;

import com.raulaquino._1_creational._1_3_singleton.shared.Connection;

import java.util.ArrayList;
import java.util.List;

public class _1_3_1_2_ConnectionPool {
    private final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    public _1_3_1_2_ConnectionPool() {
        System.out.println("Creating Connection Pool");
        this.connectionsPool = new ArrayList<Connection>();
        for(int i = 1; i < POOL_SIZE; i++) {
            this.connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection avaiable = null;
        for(Connection conn: this.connectionsPool) {
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
