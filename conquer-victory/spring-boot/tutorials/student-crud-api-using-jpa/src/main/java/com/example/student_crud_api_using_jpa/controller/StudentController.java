package com.example.student_crud_api_using_jpa.controller;

import com.example.student_crud_api_using_jpa.model.Student;
import com.example.student_crud_api_using_jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{rno}")
    public ResponseEntity<Student> getStudentByRno(@PathVariable("rno") int rno) {
        Student student = studentService.getStudentByRno(rno);
        if (student == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return new ResponseEntity<>("Success. Data posted successfully", HttpStatus.CREATED);
    }

    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Success. Data updated successfully";
    }

    @DeleteMapping("/students")
    public String deleteStudent() {
        studentService.deleteAllStudent();
        return "Success. All data deleted successfully";
    }

    @DeleteMapping("/students/{rno}")
    public String deleteStudentByRno(@PathVariable int rno) {
        studentService.deleteStudentByRno(rno);
        return "Success. Data deleted successfully";
    }

    @GetMapping("/students/name/{name}")
    public List<Student> getStudentByName(@PathVariable("name") String name) {
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/students/gender/{gender}")
    public List<Student> getStudentByGender(@PathVariable String gender) {
        return  studentService.getStudentsByGender(gender);
    }

    @GetMapping("/students/technology/{tech}")
    public List<Student> getStudentByTechnology(@PathVariable("tech") String technology) {
        return studentService.getStudentsByTechnology(technology);
    }

    @GetMapping("/students/filter")
    public List<Student> getStudentsByGenderAndTechnology(@Param("gender") String gender,
                                                          @Param("technology") String technology){
        return studentService.getStudentsByGenderAndTechnology(gender, technology);
    }
}
