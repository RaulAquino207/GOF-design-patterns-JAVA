package com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps._1_2_2_1_bymodelfactory._1_2_2_1_factory;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.Service;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserEJBService;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_2_apps.shared.UserRestService;

public class _1_2_2_2_3_UserAbstractFactory implements _1_2_2_1_1_ServiceAbstractFactory {
    @Override
    public Service<String> getEJBService() {
        return new UserEJBService();
    }

    @Override
    public Service<String> getRESTService() {
        return new UserRestService();
    }
}
