package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    @Column(length = 200)
    private String title;

    @Column(length = 200)
    private String genre;

    @Column(columnDefinition = "TEXT")
    private String plot;
}
