package com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.ports;

import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    List<User> getAll();
}
