package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public class CarEJBService implements CarService {
    @Override
    public void save(String model) {
        System.out.println("*** EJB ***");
        System.out.println("Saving CAR " + model + " using EJB.\n");
    }

    @Override
    public boolean update(String id, String newModel) {
        System.out.println("*** EJB ***");
        System.out.println("Updating CAR " + id + " using EJB | new model " + newModel + ".\n");
        return true;
    }

    @Override
    public boolean delete(String s) {
        System.out.println("Method not implemented.\n");
        return false;
    }
}
