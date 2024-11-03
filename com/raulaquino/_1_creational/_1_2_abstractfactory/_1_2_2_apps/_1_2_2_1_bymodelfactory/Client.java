package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_1_bymodelfactory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_1_bymodelfactory._1_2_2_1_factory._1_2_2_1_1_ServiceAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_1_bymodelfactory._1_2_2_1_factory._1_2_2_2_3_UserAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_1_bymodelfactory._1_2_2_1_factory._1_2_2_1_2_CarAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.Service;

public class Client {
    public static void main(String[] args) {
        _1_2_2_1_1_ServiceAbstractFactory userServiceFactory = new _1_2_2_2_3_UserAbstractFactory();
        _1_2_2_1_1_ServiceAbstractFactory carServiceFactory = new _1_2_2_1_2_CarAbstractFactory();

        Service<String> userRestService = userServiceFactory.getRESTService();
        userRestService.save("Raul");
        userRestService.update("1", "Raul Aquino");
        userRestService.delete("1");

        Service<String> carEJBService = carServiceFactory.getEJBService();
        carEJBService.save("Model X");
        carEJBService.update("2", "Model S");
        carEJBService.delete("2");


    }
}
