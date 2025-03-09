package com.example.Notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Override
    public void notifyPerson(String message) {
        System.out.println("Notified By Email: " + message );
    }
}
