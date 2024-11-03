package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_2_bytechnologyfactory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_2_bytechnologyfactory._1_2_2_2_factory._1_2_2_2_1_ServiceAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_2_bytechnologyfactory._1_2_2_2_factory._1_2_2_2_3_RESTAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserService;

public class Client {
    public static void main(String[] args) {
        _1_2_2_2_1_ServiceAbstractFactory restServiceFactory = new _1_2_2_2_3_RESTAbstractFactory();
        _1_2_2_2_1_ServiceAbstractFactory ejbServiceFactory = new _1_2_2_2_3_RESTAbstractFactory();

        UserService userRestService = restServiceFactory.getUserService();
        userRestService.save("Raul");
        userRestService.update("1", "Raul Aquino");
        userRestService.delete("1");

        CarService carEJBService = ejbServiceFactory.getCarService();
        carEJBService.save("Model X");
        carEJBService.update("2", "Model S");
        carEJBService.delete("2");
    }
}
