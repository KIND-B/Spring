package com.projectTest.example.projectTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="student")
@Data
public class StudentsEntity {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="First_Name")
    private String first_name;

    @Column(name="Last_Name")
    private String last_name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Grade")
    private String st_grade;

    @Column(name = "Class")
    private String st_class;

    @Column( name = "contact")
    private String contact;


}
