package com.projectTest.example.projectTest.repository;

import com.projectTest.example.projectTest.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentsEntity, Long> {
//    List<Students> findById

            Long deleteById(long id);

//        List<Students> findById(String text, String textAgain);
//@Modifying
//@Query("delete from student s where s.id=:id")
//Integer studentdelete(Long id);

}
