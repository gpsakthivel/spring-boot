package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

//        System.out.println( "Hello World!" );

//        Student student = new Student();
//        Student student = context.getBean(Student.class);
        Student student = (Student) context.getBean("st1");
//        student.age = 25;
//        System.out.println(student.age);
//        student.setAge(25);
//        System.out.println(student.getAge());
//        student.show();

        student.writeExam();
    }
}
