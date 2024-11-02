package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public class UserRestService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("*** REST ***\n\n");
        System.out.println("Saving USER " + name + " using REST");
    }

    @Override
    public boolean delete(String id) {
        System.out.println("*** REST ***\n\n");
        System.out.println("Deleting USER " + id + " using REST");
        return true;
    }
}
