package com.projectTest.example.projectTest.dto.request;

import com.sun.istack.NotNull;
import lombok.Data;

@Data

public class studentUpdateRequest {

    private Long id;
    @NotNull
    private String first_name;
    @NotNull
    private String address;
    @NotNull
    private String contact;
    @NotNull
    private String last_name;
    @NotNull
    private String st_grade;
    @NotNull
    private String st_class;
}
