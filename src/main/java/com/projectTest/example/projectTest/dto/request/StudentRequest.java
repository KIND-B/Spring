package com.projectTest.example.projectTest.dto.request;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class StudentRequest {

    private Long id;
    private String first_name;
    private String address;
    private String contact;
    private String last_name;
    private String st_grade;
    private String st_class;


}
