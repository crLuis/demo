package com.ironhack.bootcamp.demo.service;

import com.ironhack.bootcamp.demo.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    List<Course> listCourses();

}
