package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public interface CarService extends Service<String> {
    void save(String model);
    boolean update(String id, String newModel);
}
