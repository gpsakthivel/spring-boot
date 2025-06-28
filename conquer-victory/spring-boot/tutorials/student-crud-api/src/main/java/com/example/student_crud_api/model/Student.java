package com.example.student_crud_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int rno;
    private String name;
    private String technology;

//    public Student(int rno, String name, String technology) {
//        this.rno = rno;
//        this.name = name;
//        this.technology = technology;
//    }

}
