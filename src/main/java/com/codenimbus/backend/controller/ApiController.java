package com.codenimbus.backend.controller;

import com.codenimbus.backend.entity.Course;
import com.codenimbus.backend.entity.Dsa;
import com.codenimbus.backend.entity.Question;
import com.codenimbus.backend.serviceImpl.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private ApiServiceImpl service;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        // Implement logic to return courses
        return service.getCourses();
    }

    @PostMapping("/courses")
    public ResponseEntity<String> addCourse(@RequestBody Course course) {
        if ( service.addCourse(course) ) {
            return new ResponseEntity<>("Course added successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to add course", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dsa")
    public List<Dsa> getDsaTopics() {
        // Implement logic to return DSA topics
        return service.getDsa();
    }

    @GetMapping("/questions/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        // Implement logic to return questions by category
        return  service.getQuestionsByCategory(category);
    }
}

