package com.example.UserRegistration;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> users = new HashMap<>();
    @Override
    public boolean save(User user) {
        User checkUser = this.getUserByEmail(user.getEmail());

        if (checkUser != null) {
            System.out.println("User already in database");
            return false;
        }

        users.put(user.getEmail(), user);
        System.out.println("New user created");
        return true;
    }

    public User getUserByEmail(String email) {
       return users.getOrDefault(email, null);
    }
}
