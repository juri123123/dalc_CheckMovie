package com.example.demo.dto;

import com.example.demo.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import javax.persistence.criteria.CriteriaBuilder;

//@AllArgsConstructor
@ToString
public class MovieDto {

    private Integer movie_id;

    private String title;

    private String movie_img;

    public Movie toEntity() {
        return new Movie(movie_id, title, movie_img);
    }

    @Builder
    public MovieDto(Integer movie_id, String title, String movie_img) {
        this.movie_id = movie_id;
        this.title = title;
        this.movie_img = movie_img;
    }
}