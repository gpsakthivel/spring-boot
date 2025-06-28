package com.example.get_post_ui_data_integration.service;

import com.example.get_post_ui_data_integration.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Aathan", "AI"),
                    new Student(2, "Saif", "Blockchain"),
                    new Student(29, "Balaji", "Java")
            )
    );

    public List<Student> getAllStudents() {
        return students;
    }


    public void addStudents(int rno, String name, String technology) {
        Student student = new Student(rno, name, technology);
        students.add(student);
    }
}
