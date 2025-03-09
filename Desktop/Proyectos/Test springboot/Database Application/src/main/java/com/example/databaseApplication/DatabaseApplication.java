package com.example.databaseApplication;

import com.example.databaseApplication.entities.*;
import com.example.databaseApplication.repositories.UserRepository;
import com.example.databaseApplication.services.ProductService;
import com.example.databaseApplication.services.ProfileService;
import com.example.databaseApplication.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DatabaseApplication.class, args);
		ProfileService profileService = context.getBean(ProfileService.class);
		profileService.getProfilesByPointsWithQuery();
	}

}
