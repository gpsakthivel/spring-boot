package com.example.course_registration_system.controller;

import com.example.course_registration_system.model.Course;
import com.example.course_registration_system.model.CourseRegistry;
import com.example.course_registration_system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("courses")
    public List<Course> availableCourses() {
        return courseService.availableCourses();
    }

    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledCourses() {
        return courseService.enrolledCourses();
    }

    @PostMapping("courses/register")
    public String enrollCourses(@RequestParam("name") String name,
                                              @RequestParam("emailId") String emailId,
                                              @RequestParam("courseName") String courseName) {
        courseService.enrollCourses(name, emailId, courseName);
        return "Congrats! " + name + " Enrollment Successful for " + courseName;
    }
}
