package com.ironhack.bootcamp.demo.repository;

import com.ironhack.bootcamp.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//REPOSITORIO QUE USARÁ EL JPA CON EL MODELO 'COURSE' Y QUE USARÁ UNA CLAVE PRIMARIA String(VARCHAR)
@Repository
public interface CourseRepository extends JpaRepository< Course, String> {

}
