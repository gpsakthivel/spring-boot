package com.example.first_spring_boot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer {
    public Pencil() {
        System.out.println("Pencil is created");
    }

    public void write() {
        System.out.println("Writing using my pencil");
    }
}
