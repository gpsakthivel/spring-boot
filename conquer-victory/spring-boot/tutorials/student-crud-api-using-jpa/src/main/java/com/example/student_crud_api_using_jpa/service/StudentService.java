package com.example.student_crud_api_using_jpa.service;

import com.example.student_crud_api_using_jpa.model.Student;
import com.example.student_crud_api_using_jpa.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentByRno(int rno) {
//        return studentRepo.findById(rno);
        return studentRepo.findById(rno).orElse(null);
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteAllStudent() {
        studentRepo.deleteAll();
    }

    public void deleteStudentByRno(int rno) {
        studentRepo.deleteById(rno);
    }

    public List<Student> getStudentsByName(String name) {
        return studentRepo.findByName(name);
    }

    public List<Student> getStudentsByGender(String gender) {
        return studentRepo.findByGender(gender);
    }

    public List<Student> getStudentsByTechnology(String technology) {
        return studentRepo.findByTechnology(technology);
    }

    public List<Student> getStudentsByGenderAndTechnology(String gender, String technology){
        return studentRepo.findByGenderAndTechnology(gender, technology);
    }
}
