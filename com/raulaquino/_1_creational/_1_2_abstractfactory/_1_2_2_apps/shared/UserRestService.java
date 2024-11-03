package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public class UserRestService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("*** REST ***");
        System.out.println("Saving USER " + name + " using REST.\n");
    }

    @Override
    public boolean update(String s, String any) {
        System.out.println("Method not implemented.\n");
        return false;
    }

    @Override
    public boolean delete(String id) {
        System.out.println("*** REST ***");
        System.out.println("Deleting USER " + id + " using REST.\n");
        return true;
    }
}
