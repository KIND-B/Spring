package com.projectTest.example.projectTest.dto.request;

import lombok.Data;

import javax.persistence.Column;

@Data
public class StudentRequest {

    private Long id;
    private String name;
    private String address;
    private String contact;
}
