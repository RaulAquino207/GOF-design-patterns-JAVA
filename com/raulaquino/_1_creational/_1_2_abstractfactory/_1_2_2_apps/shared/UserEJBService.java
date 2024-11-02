package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public class UserEJBService implements UserService{
    @Override
    public void save(String name) {
        System.out.println("*** EJB ***\n\n");
        System.out.println("Saving USER " + name + " using EJB");
    }

    @Override
    public boolean delete(String id) {
        System.out.println("*** EJB ***\n\n");
        System.out.println("Deleting USER " + id + " using EJB");
        return true;
    }
}
