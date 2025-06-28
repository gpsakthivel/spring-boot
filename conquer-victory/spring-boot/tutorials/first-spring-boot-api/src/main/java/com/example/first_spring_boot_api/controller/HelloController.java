package com.example.first_spring_boot_api.controller;

import com.example.first_spring_boot_api.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

//    // Constructor
//    public HelloController() {
//        System.out.println("Hello Controller Object Created...");
//    }

    @Autowired
    HelloService service;

    @GetMapping("/")
    public String greet() {
        return service.greeting();
    }

}
