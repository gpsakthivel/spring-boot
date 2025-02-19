package com.telusko.MyApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MyAppApplication.class, args);

//		Manually creating an object from the Dev class
//		Dev obj = new Dev();
//		obj.build();


//		Using spring boot build-in class for creating an object from the Dev class
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
