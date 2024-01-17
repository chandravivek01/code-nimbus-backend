package com.codenimbus.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "dynamic_programming_question")
public class DynamicProgrammingQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "question_name")
    private String questionName;

    @Column(name = "statement", columnDefinition = "TEXT")
    private String statement;

    @Column(name = "example", columnDefinition = "TEXT")
    private String example;
}
