package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;

    @Column(length = 200)
    private String title;

    @Column(length = 200)
    private String genre;

    @Column(columnDefinition = "TEXT")
    private String plot;

}
