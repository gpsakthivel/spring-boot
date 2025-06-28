package com.example.first_spring_boot_api.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class HelloService {

//    // Constructor
//    public HelloService() {
//        System.out.println("Hello Service Object Created...");
//    }

    public String greeting() {
        // Business Logic
        return "Hello World!";
    }
}
