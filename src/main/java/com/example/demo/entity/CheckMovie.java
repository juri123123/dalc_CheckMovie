package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CheckMovie {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer list_id;
//
//    @ManyToOne
//    @JoinColumn(name = "movie_id")
//    private Movie movie;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movie_id;

    @Column(length = 200)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String movie_img;

}
