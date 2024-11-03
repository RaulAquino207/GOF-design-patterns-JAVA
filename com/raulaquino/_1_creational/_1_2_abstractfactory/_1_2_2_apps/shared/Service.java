package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared;

public interface Service<ID> {
    /*
    * Obviously in this case, the right thing to do would be to pass T as a parameters to save and update,
    * BUT as it is just an example at the study level we will leave any.
    * */

    void save(String any);
    boolean update(ID id, String any);
    boolean delete(ID id);
}
