package com.example.UserRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserRegistrationServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UserRegistrationServiceApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		User john = new User("jm10yap@gmail.com", "test", "john");
		userService.registerUser(john);
		User manuel = new User("jm10yap@gmail.com", "test", "john");
		userService.registerUser(john);
	}

}
