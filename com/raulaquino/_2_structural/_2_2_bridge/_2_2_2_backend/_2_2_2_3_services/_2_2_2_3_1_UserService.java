package com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_3_services;

import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_1_dao._2_2_2_1_1_UserDao;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_2_model._2_2_2_2_1_User;

public abstract class  _2_2_2_3_1_UserService {
    protected _2_2_2_1_1_UserDao dao;

    public _2_2_2_3_1_UserService(_2_2_2_1_1_UserDao dao) {
        this.dao = dao;
    }

    public abstract void save(_2_2_2_2_1_User user);
}
