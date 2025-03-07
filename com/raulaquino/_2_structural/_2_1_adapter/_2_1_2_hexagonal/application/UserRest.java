package com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.application;

import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.model.User;
import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.ports.UserRepository;
import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.usecases.UserService;
import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.infra.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UserRest {
    private final UserService userService;

    public UserRest() {
        UserRepository userRepository = new UserMemoryDatabaseAdapter();
        userService = new UserService(userRepository);
    }

    public Integer post(Map<String, String> values) {
        try {
            User user = new User(values.get("name"), values.get("email"), values.get("pass"));
            this.userService.saveUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 400;
        }

        return 201;
    }

    public Integer get() {
        List<User> users = this.userService.getUsers();
        users.stream().forEach(System.out::println);
        return 200;
    }

}
