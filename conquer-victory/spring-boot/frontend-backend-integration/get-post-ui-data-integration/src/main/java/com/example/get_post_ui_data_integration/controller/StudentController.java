package com.example.get_post_ui_data_integration.controller;

import com.example.get_post_ui_data_integration.model.Student;
import com.example.get_post_ui_data_integration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/add/student")
    public void addStudents(@RequestParam("rno") int rno,
                            @RequestParam("name") String name,
                            @RequestParam("technology") String technology) {
        studentService.addStudents(rno, name, technology);
    }

}
