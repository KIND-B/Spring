package com.projectTest.example.projectTest.dto.request.Staff;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class StaffClassDeleteRequest {


    private Long id;
    private String f_name;
    private String s_name;
    private String l_name;
    private String e_mail;
    private String con_no;
    private String address_per;
    private String address_temp;
    private Date d_o_b;
    private String n_i_c;
    private Date d_o_a;
    private String password;
    private String con_password;
}
