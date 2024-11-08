package com.raulaquino._1_creational._1_3_singleton._1_3_1_before._1_3_1_conn;

public class _1_3_1_1_Connection {
    private boolean inUse;

    public _1_3_1_1_Connection() {
        this.inUse = false;
    }

    public void query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
    }

    public boolean isInUse() {
        return !this.inUse;
    }

    public void putInUse() {
        this.inUse = true;
    }

    public void removeInUse() {
        this.inUse = false;
    }
}
