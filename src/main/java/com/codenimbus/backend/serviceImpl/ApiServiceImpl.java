package com.codenimbus.backend.serviceImpl;

import com.codenimbus.backend.entity.Course;
import com.codenimbus.backend.entity.Dsa;
import com.codenimbus.backend.entity.DynamicProgrammingQuestion;
import com.codenimbus.backend.entity.StringsQuestion;
import com.codenimbus.backend.repository.CourseRepository;
import com.codenimbus.backend.repository.DsaRepository;
import com.codenimbus.backend.repository.DynamicProgrammingQuestionRepository;
import com.codenimbus.backend.repository.StringsQuestionRepository;
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
    private StringsQuestionRepository stringsQuestionRepository;

    @Autowired
    private DynamicProgrammingQuestionRepository dynamicProgrammingQuestionRepository;

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
    public boolean addDsaTopic(Dsa dsa) {

        try {
            dsaRepository.save(dsa);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<StringsQuestion> getStrings() {
        return stringsQuestionRepository.findAll();
    }

    @Override
    public boolean addStrings(StringsQuestion stringsQuestion) {

        try {
            stringsQuestionRepository.save(stringsQuestion);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<DynamicProgrammingQuestion> getDynamicProgramming() {
        return dynamicProgrammingQuestionRepository.findAll();
    }

    @Override
    public boolean addDynamicProgramming(DynamicProgrammingQuestion dynamicProgrammingQuestion) {

        try {
            dynamicProgrammingQuestionRepository.save(dynamicProgrammingQuestion);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

}
