package com.example.student_crud_api.service;

import com.example.student_crud_api.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Aathan", "AI"), // 0
                    new Student(2, "Saif", "ML"), // 1
                    new Student(3, "Sam", "NN") // 2
            )
    );

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentByRno(int rno) {
//        return students.get(rno);
        int index = 0;
        boolean found = false;
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getRno() == rno) {
                index = i;
                found = true;
                break;
            }
        }
        if (found)return students.get(index);
        else return new Student(0, "", "");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String updateStudent(Student student) {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getRno() == student.getRno()) {
                index = i;
                found = true;
                break;
            }
        }
        if (!found) {
            return "No such student exist";
        } else {
            students.set(index, student);
            return "Updation is done";
        }
    }

    public void deleteStudent() {
        for(int i = 0; i < students.size(); i++) {
            students.remove(i);
        }
    }

    public String deleteStudentByRno(int rno) {
        int index = 0;
        boolean found = false;
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getRno() == rno) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            students.remove(index);
            return "Data deleted successfully";
        } else {
            return "No such student exist";
        }
    }
}
