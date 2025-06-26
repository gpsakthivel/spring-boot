package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Pencil implements Writer {
    public Pencil() {
        System.out.println("Pencil Constructor");
    }

    public void write() {
        System.out.println("Writing using Pencil");
    }
}
