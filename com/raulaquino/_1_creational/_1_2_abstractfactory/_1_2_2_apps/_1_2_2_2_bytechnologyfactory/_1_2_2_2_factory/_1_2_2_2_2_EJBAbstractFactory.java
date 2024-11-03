package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_2_bytechnologyfactory._1_2_2_2_factory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarEJBService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserEJBService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserService;

public class _1_2_2_2_2_EJBAbstractFactory implements _1_2_2_2_1_ServiceAbstractFactory {
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}
