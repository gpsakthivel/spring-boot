package com.telusko.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    Field injection
//    @Autowired
//    private Laptop laptop;

    @Autowired
    @Qualifier("laptop")
    private Computer comp;

//    Constructor injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

//    Setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        comp.compile();
        System.out.println("Working on Awesome Project");
    }

}
