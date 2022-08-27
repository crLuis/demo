package com.ironhack.bootcamp.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name="grade")
public class Grade {

    @Id // INDICA PRIMARY KEY
    @GeneratedValue // AUTO INCREMENT EN MYSQL
    private int id; //PRIMARY KEY

    @Column(name = "student_name") // FORMA EXPLÏCITA DECLARACIÓN
    private String studentName; //student_name
    private String sectionId; // section_id
    private int score; // score

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
