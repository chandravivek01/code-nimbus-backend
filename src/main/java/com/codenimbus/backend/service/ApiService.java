package com.codenimbus.backend.service;

import com.codenimbus.backend.entity.Course;
import com.codenimbus.backend.entity.Dsa;
import com.codenimbus.backend.entity.Question;

import java.util.List;

public interface ApiService {

    public List<Course> getCourses();

    public boolean addCourse(Course course);

    public List<Dsa> getDsa();

    public List<Question> getQuestionsByCategory(String category);
}
