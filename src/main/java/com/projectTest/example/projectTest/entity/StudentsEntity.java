package com.projectTest.example.projectTest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="student")
@Data
public class StudentsEntity {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column( name = "contact")
    private String contact;


}
