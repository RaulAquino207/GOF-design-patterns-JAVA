package com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_1_dao;

import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_2_model._2_2_2_2_1_User;

public class _2_2_2_1_2_UserMongoDao implements _2_2_2_1_1_UserDao{
    @Override
    public void save(_2_2_2_2_1_User user) {
        System.out.println("Saving the user in the Mongo Database " + user);
    }
}
