package com.example.student_crud_api_using_jpa.repository;

import com.example.student_crud_api_using_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer>{
    List<Student> findByName(String name);
    List<Student> findByGender(String gender);
    List<Student> findByTechnology(String technology);

    @Query(nativeQuery = true,
    value = "SELECT * FROM student WHERE gender =:gender AND technology =:technology")
    List<Student> findByGenderAndTechnology(
            @Param("gender") String gender, @Param("technology") String technology
    );
}
