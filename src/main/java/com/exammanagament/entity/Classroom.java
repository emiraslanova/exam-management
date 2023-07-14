package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id ;
    private  String classroom;
    private LocalDateTime creat_year;
    private  int status ;
    @OneToOne
    @JoinColumn (name = "teacher_id")
    private  Teacher teacher;

}
