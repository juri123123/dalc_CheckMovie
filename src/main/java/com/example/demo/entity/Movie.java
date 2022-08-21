package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;

    @Column(length = 200)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String movie_img;

    public Movie(Integer movie_id, String title, String movie_img){
        this.movie_id = movie_id;
        this.title = title;
        this.movie_img = movie_img;
    }

}