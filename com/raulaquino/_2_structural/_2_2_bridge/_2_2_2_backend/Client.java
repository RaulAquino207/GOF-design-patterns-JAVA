package com.raulaquino._2_structural._2_2_bridge._2_2_2_backend;

import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_1_dao._2_2_2_1_2_UserMongoDao;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_1_dao._2_2_2_1_3_UserMysqlDao;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_1_dao._2_2_2_1_4_UserPostgresDao;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_2_model._2_2_2_2_1_User;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_3_services._2_2_2_3_1_UserService;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_3_services._2_2_2_3_2_UserRest;
import com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_3_services._2_2_2_3_3_UserSoap;

public class Client {
    public static void main(String[] args) {
        _2_2_2_2_1_User user = new _2_2_2_2_1_User("Raul", "aquinoraul207@gmail.com", "1234");

        _2_2_2_3_1_UserService userRestMysqlService = new _2_2_2_3_2_UserRest(new _2_2_2_1_3_UserMysqlDao());
        userRestMysqlService.save(user);

        _2_2_2_3_1_UserService userSoapPostgresService = new _2_2_2_3_3_UserSoap(new _2_2_2_1_4_UserPostgresDao());
        userSoapPostgresService.save(user);

        _2_2_2_3_1_UserService userRestMongoService = new _2_2_2_3_2_UserRest(new _2_2_2_1_2_UserMongoDao());
        userRestMongoService.save(user);
    }
}
