package com.ironhack.bootcamp.demo.repository;

import com.ironhack.bootcamp.demo.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {

    List<Grade> findAllByScoreGreaterThan(Integer score);
    List<Grade> findAllByScoreGreaterThanOrderByStudentName(Integer score);
    //List<Grade> findAllByScoreGreaterThanOrderByStdentNameStartingWith(Integer score, char firstNameStart);
    List<Grade> findAllBySectionIdNot(Integer sectionID);

    List <Grade> updateGrade(Grade grade);
    List <Grade> findAllInGrade(Grade grade);
    List <Grade> deleteGrade(Grade grade);


}
