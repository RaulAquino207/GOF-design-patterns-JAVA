package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_2_bytechnologyfactory._1_2_2_2_factory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarRestService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserRestService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserService;

public class _1_2_2_2_3_RESTAbstractFactory implements _1_2_2_2_1_ServiceAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}
