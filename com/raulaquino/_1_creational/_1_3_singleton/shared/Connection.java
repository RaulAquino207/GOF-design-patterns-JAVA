package com.raulaquino._1_creational._1_3_singleton.shared;

public class Connection {
    private boolean inUse;

    public Connection() {
        System.out.println("New Connection");
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
