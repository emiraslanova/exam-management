package com.exammanagament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "question_answers")

public class QuestionAnswers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "question_answers")
    private String question_answers;
    @Column(name = "is_true")
    private int is_true;
    @OneToOne
    @JoinColumn(name = "question_id")
    private  Questions questions;

}
