package com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_3_services;

import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_1_dao._2_2_2_1_1_UserDao;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_2_model._2_2_2_2_1_User;

public class _2_2_2_3_2_UserRest extends _2_2_2_3_1_UserService {
    public _2_2_2_3_2_UserRest(_2_2_2_1_1_UserDao dao) {
        super(dao);
    }
    @Override
    public void save(_2_2_2_2_1_User user) {
        System.out.println("Starting a save operation through Rest Protocol");
        dao.save(user);
    }
}
