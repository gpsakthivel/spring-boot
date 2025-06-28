package com.example.first_spring_boot;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer {
    public Pen() {
        System.out.println("Pen is created");
    }

    public void write() {
        System.out.println("Writing using my pen");
    }
}
