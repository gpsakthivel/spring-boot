package com.example.course_registration_system.service;

import com.example.course_registration_system.model.Course;
import com.example.course_registration_system.model.CourseRegistry;
import com.example.course_registration_system.repository.CourseRegistryRepo;
import com.example.course_registration_system.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledCourses() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourses(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name, emailId, courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
