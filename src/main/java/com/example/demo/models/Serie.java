package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="serie")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;
    @Column(name="cdrom_id")
    private Long cdRomID;

    @ManyToMany
    @JoinTable(
            name = "SerieQuestion",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private Set<Question> questions;

}
