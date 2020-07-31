package com.projectTest.example.projectTest.repository;

import com.projectTest.example.projectTest.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentsEntity, Long> {


//        List<Students> findById(String text, String textAgain);

}
