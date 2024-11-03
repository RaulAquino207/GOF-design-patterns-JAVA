package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_1_bymodelfactory._1_2_2_1_factory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.Service;

public interface _1_2_2_1_1_ServiceAbstractFactory {
    Service<String> getEJBService();
    Service<String> getRESTService();
}
