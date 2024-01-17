package com.codenimbus.backend.controller;

import com.codenimbus.backend.entity.Course;
import com.codenimbus.backend.entity.Dsa;
import com.codenimbus.backend.entity.DynamicProgrammingQuestion;
import com.codenimbus.backend.entity.StringsQuestion;
import com.codenimbus.backend.serviceImpl.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
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

    @PostMapping("/dsa")
    public ResponseEntity<String> addDsaTopic(@RequestBody Dsa dsa) {

        if ( service.addDsaTopic(dsa) ) {
            return new ResponseEntity<>("Topic added successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to add topic", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/questions/strings")
    public List<StringsQuestion> getQuestionsByStrings() {
        // Implement logic to return questions by category
        return  service.getStrings();
    }

    @PostMapping("/questions/strings")
    public ResponseEntity<String> addStringsuestion(@RequestBody StringsQuestion stringsQuestion) {

        if ( service.addStrings(stringsQuestion) ) {
            return new ResponseEntity<>("Question added successfully", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to add question", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/questions/dynamicprogramming")
    public List<DynamicProgrammingQuestion> getQuestionsByDynamicProgramming() {
        // Implement logic to return questions by category
        return  service.getDynamicProgramming();
    }
}

