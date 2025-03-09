package com.example.Notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(NotificationApplication.class, args);
		NotificationManager notificationManager = context.getBean(NotificationManager.class);
		notificationManager.sendNotification("Testing the app");
	}

}
