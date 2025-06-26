package com.telusko;

public class Pen implements Writer {

    public Pen() {
        System.out.println("Pen is created...");
    }

    public void write(){
        System.out.println("Writing using pen");
    }
}
