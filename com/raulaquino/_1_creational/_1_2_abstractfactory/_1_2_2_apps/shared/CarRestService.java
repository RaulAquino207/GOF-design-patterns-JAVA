package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public class CarRestService implements CarService{
    @Override
    public void save(String model) {
        System.out.println("*** REST ***\n\n");
        System.out.println("Saving CAR " + model + " using REST");
    }

    @Override
    public boolean update(String id, String newModel) {
        System.out.println("*** REST ***\n\n");
        System.out.println("Updating CAR " + id + " using REST | new model " + newModel);
        return true;
    }
}
