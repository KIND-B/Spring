package com.projectTest.example.projectTest.repository;

import com.projectTest.example.projectTest.entity.StudentGradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGradeRepository extends JpaRepository<StudentGradeEntity, Long> {


    Long deleteById(long id);

}
