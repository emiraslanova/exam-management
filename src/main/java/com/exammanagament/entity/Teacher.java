package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.intellij.lang.annotations.Pattern;

import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "teacher")

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  long id ;
    @Column(name = "email")
    private  String email;
    @Column(name = "password")
    private String password;
    @Column(name = "first_name")
    private String first_name ;
    @Column(name = "last_name")
    private  String last_name ;

    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "birth_date")
    private Date birth_date;
    @Column(name = "last_login_date")
    private Date last_login_date;
    @Column(name = "last_login_ip")
    private String last_login_ip;
    @Column(name = "status")
    private int status;
    @Column(name = "salary")
    private int salary;






}
