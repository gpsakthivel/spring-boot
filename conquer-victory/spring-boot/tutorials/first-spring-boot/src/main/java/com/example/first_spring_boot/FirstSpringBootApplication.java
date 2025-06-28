package com.example.first_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);
//		Using manual method to create an object
//		Student st = new Student();
//		st.show();

//		Object aka bean
//		Using spring boot to create an object
//		Student student = context.getBean(Student.class); // new Student();
//		student.age = 22;
//		student.show();

//		Scope
//		Student student1 = context.getBean(Student.class);
//		student1.show();
//		System.out.println(student.age + " " + student1.age);


		Student student = context.getBean(Student.class);
		student.show();
		student.writeExam();
	}

}
