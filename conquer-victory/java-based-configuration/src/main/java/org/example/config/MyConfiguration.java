package org.example.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.example.Pen;
//import org.example.Pencil;
//import org.example.Student;
//import org.example.Writer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.example")
public class MyConfiguration {

//    @Bean
//    public Student student(@Qualifier("pencil") Writer writer){ // new Pen()
//        // assigning value to attributes
//        Student st = new Student();
//        st.setRno(33);
//        st.setWriter(writer); // new Pen()
//        return st;
//    }

//    @Bean
//    public Student getObj(){
//        return new Student();
//    }

//    @Bean(name = "s1")
//    public Student student(){
//        return new Student();
//    }

//    @Bean
//    @Primary
//    public Pen pen(){
//        return new Pen();
//    }
//
//    @Bean
//    public Pencil pencil(){
//        return new Pencil();
//    }
}
