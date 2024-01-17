package com.codenimbus.backend.serviceImpl;

import com.codenimbus.backend.entity.Course;
import com.codenimbus.backend.entity.Dsa;
import com.codenimbus.backend.entity.Question;
import com.codenimbus.backend.repository.CourseRepository;
import com.codenimbus.backend.repository.DsaRepository;
import com.codenimbus.backend.repository.QuestionRepository;
import com.codenimbus.backend.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private DsaRepository dsaRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public boolean addCourse(Course course) {

        try {
            courseRepository.save(course);
            return true;
        }
        catch (Exception e) {
            // Log the exception or handle it as needed
            return false;
        }
    }

    @Override
    public List<Dsa> getDsa() {
        return dsaRepository.findAll();
    }

    @Override
    public List<Question> getQuestionsByCategory(String category) {
        return null;
    }
}
