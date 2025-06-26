package org.example;

import org.example.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
//        Student st = context.getBean(Student.class); // Student st = new Student();
        Student st = (Student) context.getBean("student");
//        Student st = (Student) context.getBean("getObj");
//        Student st = (Student) context.getBean("s1");
        st.show();
//        st.setRno(22);
        System.out.println("Roll no = " + st.getRno());
        st.writeExam();
    }
}
