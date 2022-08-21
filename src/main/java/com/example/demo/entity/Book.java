package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
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
