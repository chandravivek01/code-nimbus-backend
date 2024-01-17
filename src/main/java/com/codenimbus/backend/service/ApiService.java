package com.codenimbus.backend.service;

import com.codenimbus.backend.entity.Course;
import com.codenimbus.backend.entity.Dsa;
import com.codenimbus.backend.entity.DynamicProgrammingQuestion;
import com.codenimbus.backend.entity.StringsQuestion;

import java.util.List;

public interface ApiService {

    public List<Course> getCourses();

    public boolean addCourse(Course course);

    public List<Dsa> getDsa();

    public boolean addDsaTopic(Dsa dsa);

    public List<StringsQuestion> getStrings();

    public boolean addStrings(StringsQuestion stringsQuestion);

    public List<DynamicProgrammingQuestion> getDynamicProgramming();

    public boolean addDynamicProgramming(DynamicProgrammingQuestion dynamicProgrammingQuestion);
}
