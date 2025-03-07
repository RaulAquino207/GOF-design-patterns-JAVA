package com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.infra;

import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.model.User;
import com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.ports.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMemoryDatabaseAdapter implements UserRepository {

   private final Map<String, User> memoryUsers = new HashMap<String, User>();

    @Override
    public void save(User user) {
        this.memoryUsers.put(user.getEmail(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(memoryUsers.values());
    }
}
