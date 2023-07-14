package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int  id;
    @Column(name = "exam_name")
    private String exam_name;
    @Column(name = "start_date")
    private LocalDateTime start_date;
    @OneToOne
    @JoinColumn(name = "exam_type_id")
    private ExamType examType;





}
