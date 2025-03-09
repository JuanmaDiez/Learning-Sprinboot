package com.example.UserRegistration;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Sending email to " + recipientEmail + ": " + message);
    }
}
