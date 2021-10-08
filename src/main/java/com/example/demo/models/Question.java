package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Integer id;
    @Column(name="intitule")
    private String intitule;
    @Column(name="reponse")
    private String reponse;
    @Column(name="niveauDifficulte")
    private String niveauDifficulte;
    @Column(name="theme")
    private String theme;
}
