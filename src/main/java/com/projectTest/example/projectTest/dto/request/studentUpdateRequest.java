package com.projectTest.example.projectTest.dto.request;

import com.sun.istack.NotNull;
import lombok.Data;

@Data

public class studentUpdateRequest {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String address;
    @NotNull
    private String contact;
}
