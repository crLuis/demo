package com.ironhack.bootcamp.demo.service;

import com.ironhack.bootcamp.demo.model.Course;
import com.ironhack.bootcamp.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CourseServiceImpl implements  CourseService{

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> listCourses() {
        return courseRepository.findAll();
    }


}
