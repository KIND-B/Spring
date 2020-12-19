package com.projectTest.example.projectTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student_grade")
public class StudentGradeEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "grade_name")
    private String grade_name;


}
