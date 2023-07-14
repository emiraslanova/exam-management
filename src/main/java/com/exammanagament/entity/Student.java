package com.exammanagament.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id ;
    @Column(name = "email")
    private  String email;
    @Column(name = "password")
    private String password;
    @Column(name = "join_Date")
    private LocalDateTime join_date ;
    @Column(name = "birth_date")
    private Date birth_date ;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "status")
    private int status;
    @Column(name = "last_login_ip")
    private  String last_login_ip;
    @Column(name = "first_name")
    private  String first_name ;
    @Column(name = "last_name")
    private String last_name;
    @OneToOne
    @JoinColumn(name = "parent_id")
    private  Parent parent;
    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom  classroom;
    @ManyToMany
    @JoinTable(name = "classroom_student",
    joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "classroom_id"))
    private List<Classroom> classrooms;











}
