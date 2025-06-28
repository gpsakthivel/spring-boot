package com.example.student_crud_api.controller;

import com.example.student_crud_api.model.Student;
import com.example.student_crud_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("students/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int rno) {
        return studentService.getStudentByRno(rno);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Success. Data posted successfully";
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
//        return "Success. Data updated successfully";
    }

    @DeleteMapping("students")
    public String deleteStudent() {
        studentService.deleteStudent();
        return "Success. All data deleted successfully";
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudentByRno(@PathVariable("rno") int rno) {
        return studentService.deleteStudentByRno(rno);
//        return "Success. Data deleted successfully";
    }
}
