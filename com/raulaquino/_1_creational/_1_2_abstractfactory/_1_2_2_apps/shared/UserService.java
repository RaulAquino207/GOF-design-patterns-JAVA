package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public interface UserService extends Service<String> {
    void save(String name);
    boolean delete(String id);
}
