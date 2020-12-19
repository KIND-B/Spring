package com.projectTest.example.projectTest.repository;

import com.projectTest.example.projectTest.entity.StudentClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentClassRepository extends JpaRepository<StudentClassEntity, Long> {

    Long deleteById(long id);
}
