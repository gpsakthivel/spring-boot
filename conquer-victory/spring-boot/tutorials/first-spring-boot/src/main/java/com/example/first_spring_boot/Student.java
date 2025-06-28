package com.example.first_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//@Scope("prototype")
public class Student {
//    Scope
//    int age;

//    Pen pen = new Pen();


//    // Dependency injection types
//    // Field Injection
//    // Using @Autowired above the variable name is called field injection
//    @Autowired
//    private Pen pen;
//    // It means private Pen pen = null;
//    // It is called field injection


//    // Setter Injection
//    // Create a setter method and the spring boot will automatically call the method to assign a value. Give @Autowired to the set method name.
//    private Pen pen;
//    // Created Setter method
//    @Autowired
//    public void setPen(Pen pen) {
//        System.out.println("Setter method is called...");
//        this.pen = pen;
//    }
//    // It is called setter injection


//    // Constructor Injection
//    // Create a constructor method and the spring boot will automatically call the method to assign a value. @Autowired to the constructor method name is not necessary.
//    private Pen pen;
//    // Created constructor method
//    public Student(Pen pen) {
//        System.out.println("Constructor method is called...");
//        this.pen = pen;
//    }
//    // It is called constructor injection


//    public Student() {
//        System.out.println("Student is created");
//    }


    @Autowired
    @Qualifier("pen")
    private Writer writer;

    public static void show() {
        System.out.println("Hello World");
    }

    public void writeExam() {
        writer.write();
    }
}
