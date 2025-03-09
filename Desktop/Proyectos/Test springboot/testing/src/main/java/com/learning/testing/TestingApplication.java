package com.learning.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestingApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(TestingApplication.class, args);
		OrderService orderService = context.getBean(OrderService.class);
		//OrderService orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder();
	}

}
