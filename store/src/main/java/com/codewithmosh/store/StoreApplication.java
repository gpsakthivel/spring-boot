package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StoreApplication.class, args);

		// var orderService = new OrderService(new StripePaymentService());
		// orderService.placeOrder();
		// System.out.println("So that we can use new payment service without affecting the existing methods...");

		// var orderService = new OrderService();
		// context.getBean(OrderService.class);
		// orderService.setPaymentService(new PayPalPaymentService());
		// orderService.placeOrder();

		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}

}
