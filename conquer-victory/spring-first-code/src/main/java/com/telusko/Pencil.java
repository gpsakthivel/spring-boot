package com.telusko;

public class Pencil implements Writer {

    public Pencil() {
        System.out.println("Pencil is created...");
    }

    public void write(){
        System.out.println("Writing using pencil");
    }
}
