package com.joaoalves.userregistrationservice;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
        users.put(user.getEmail(), user);
    }
}
