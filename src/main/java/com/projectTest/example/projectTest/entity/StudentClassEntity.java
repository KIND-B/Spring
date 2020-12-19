package com.projectTest.example.projectTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student_class")
public class StudentClassEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "class_name")
    private String Class_name;
}
