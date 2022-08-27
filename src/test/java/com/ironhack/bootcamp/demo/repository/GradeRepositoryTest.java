package com.ironhack.bootcamp.demo.repository;

import com.ironhack.bootcamp.demo.model.Grade;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GradeRepositoryTest {

    @Autowired
    private GradeRepository gradeRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void findAllByScoreGreaterThan() {

        List<Grade> response = gradeRepository.findAllByScoreGreaterThan(50);
        assertEquals(3,response.size());
    }

    @Test
    void findAllByScoreGreaterThanOrderByStudentName() {

        List<Grade> response = gradeRepository.findAllByScoreGreaterThanOrderByStudentName(70);

    }

    @Test
    void findAllBySectionIdNot() {
    }
}