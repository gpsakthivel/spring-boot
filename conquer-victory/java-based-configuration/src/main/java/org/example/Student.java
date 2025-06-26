package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("23")
    private int rno; // 0

    @Autowired
    @Qualifier("pen")
    private Writer writer; // null // new Pen(), new Pencil()

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Writer getWriter() {
        return writer;
    }

    @Autowired
    @Qualifier("pencil")
    public void setWriter(Writer writer) {
        System.out.println("Setter called");
        this.writer = writer;
    }

    public Student() {
        System.out.println("Student Constructor");
    }

    public void show() {
        System.out.println("In show method");
    }

    public void writeExam() {
        writer.write();
    }

    @Autowired
    public Student(@Qualifier("pencil") Writer writer) {
        this.writer = writer;
    }
}
