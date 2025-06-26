package com.telusko;

public class Student {

//    public Student() {
    ////        System.out.println(new Student());
//        System.out.println("Student is created...");
//    }

    // primitive type
    private int age;
    private int rno;

//    // Reference type
//    Pen pen = new Pen();
//    private Pen pen;
//    public Pen getPen() {
//        return pen;
//    }
//    public void setPen(Pen pen) {
//        this.pen = pen;
//    }

//    public int getRno() {
//        return rno;
//    }
//    public void setRno(int rollno) {
//        this.rno = rollno;
//    }

//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        System.out.println("value is changing");
//        if (age < 0) this.age= 0;
//        else this.age = age;
//    }
//    public void setAge(int age) {
//        System.out.println("setter is called by spring");
//        this.age = age;
//    }

    private Writer writer;

    public Student(int age, int rno, Writer writer) {
        System.out.println("Para constructor called");
        this.age =age;
        this.rno =rno;
        this.writer = writer;
    }

    public Student() {

    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void show() {
        System.out.println("In show method");
    }

//    public void  writeExam() {
//        pen.write();
//    }

    public  void writeExam() {
        writer.write();
    }
}
