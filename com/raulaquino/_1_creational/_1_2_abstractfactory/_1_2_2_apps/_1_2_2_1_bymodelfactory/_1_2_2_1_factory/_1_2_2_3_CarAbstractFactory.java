package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_1_bymodelfactory._1_2_2_1_factory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarEJBService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.CarRestService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.Service;

public class _1_2_2_3_CarAbstractFactory implements _1_2_2_1_ServiceAbstractFactory{
    @Override
    public Service getEJBService() {
        return new CarEJBService();
    }

    @Override
    public Service getRESTService() {
        return new CarRestService();
    }
}
