package com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.usecases;

import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.model.User;
import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.ports.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        boolean alreadyUsedEmail = this.userRepository.getAll().stream().anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(user.getEmail()));

        if (alreadyUsedEmail) throw new RuntimeException("Email already exists");
        this.userRepository.save(user);
    }

    public List<User> getUsers() {
        return this.userRepository.getAll();
    }
}
