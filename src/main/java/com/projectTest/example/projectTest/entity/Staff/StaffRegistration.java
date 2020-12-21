package com.projectTest.example.projectTest.entity.Staff;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "staffRegister")
public class StaffRegistration {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "f_name" , length = 11)
    private String f_name;

    @Column(name = "s_name", length = 11)
    private  String s_name;

    @Column(name = "l_name" , length = 11)
    private String l_name;

    @Column(name = "e_mail", length = 20)
    private String e_mail;

    @Column(name = "con_no", length = 20)
    private String con_no;

    @Column(name = "address_per", length = 50)
    private String address_per;

    @Column(name = "address_temp", length = 50)
    private String address_temp;

    @Column(name = "d_o_b")
    private Date d_o_b;

    @Column(name = "n_i_c", length =20)
    private String n_i_c;

    @Column(name = "d_o_a")
    private Date d_o_a;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "con_password", length = 20)
    private String con_password;







}
