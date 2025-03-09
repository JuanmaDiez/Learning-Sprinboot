package com.example.Notification;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService {
    @Override
    public void notifyPerson(String message) {
        System.out.println("Notified by SMS: " + message);
    }
}
