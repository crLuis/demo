package com.ironhack.bootcamp.demo.repository;

import com.ironhack.bootcamp.demo.model.Course;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    @AfterEach
    void tearDown(){
        courseRepository.deleteById("CS105");
    }

    @Test
    void test_createInstance() {

        Course course = new Course();
        course.setCourseName("Java Bootcamp");
        course.setCourseCode("CS105");
        courseRepository.save(course);

        Optional<Course> dbCourse = courseRepository.findById("CS105");

        assertTrue(dbCourse.isPresent());
        assertTrue(dbCourse.isEmpty());

        assertEquals(course.getCourseCode(),dbCourse.get().getCourseCode());
        assertEquals(course.getCourseName(),dbCourse.get().getCourseName());

    }

}