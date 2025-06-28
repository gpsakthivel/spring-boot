package com.example.first_spring_boot;

import org.springframework.stereotype.Component;

@Component
public class Sketch implements  Writer {
    public Sketch() {
        System.out.println("Sketch is created");
    }

    public void write() {
        System.out.println("Writing using my sketch");
    }
}
