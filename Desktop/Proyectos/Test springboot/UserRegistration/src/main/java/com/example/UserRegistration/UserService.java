package com.example.UserRegistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private NotificationService notificationService;
    private UserRepository userRepository;

    @Autowired
    public UserService(NotificationService notificationService, UserRepository userRepository) {
        this.notificationService = notificationService;
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        boolean saved = userRepository.save(user);
        if (saved) notificationService.send("User " + user.getName() + " has been created", user.getEmail());
    }
}
