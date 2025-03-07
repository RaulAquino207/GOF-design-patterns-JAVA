package com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal;

import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.application.UserRest;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        UserRest userRestApi = new UserRest();
        Map<String, String> body = new HashMap<String, String>();
        body.put("name", "User 1");
        body.put("email", "user1@gmail.com");
        body.put("pass", "1234");

        Integer statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        body = new HashMap<String, String>();
        body.put("name", "User 2");
        body.put("email", "user2@gmail.com");
        body.put("pass", "1234");

        statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        body = new HashMap<String, String>();
        body.put("name", "User 1");
        body.put("email", "user1@gmail.com");
        body.put("pass", "1234");

        statusCode = userRestApi.post(body);
        System.out.println(statusCode);

        statusCode = userRestApi.get();
        System.out.println(statusCode);
    }
}
