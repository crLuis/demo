package com.ironhack.bootcamp.demo.Controler;

import com.ironhack.bootcamp.demo.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ironhack.bootcamp.demo.service.CourseService;

import java.util.List;

@RestController
public class CourseControler {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> listCourses(){
        return courseService.listCourses();
    }
}
