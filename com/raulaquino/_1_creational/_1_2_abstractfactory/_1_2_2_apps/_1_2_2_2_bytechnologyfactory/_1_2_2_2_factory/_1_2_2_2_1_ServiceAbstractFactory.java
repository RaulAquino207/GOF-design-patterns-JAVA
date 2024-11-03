package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_2_bytechnologyfactory._1_2_2_2_factory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserService;

public interface _1_2_2_2_1_ServiceAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
