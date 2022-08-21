package com.example.demo.dto;

import com.example.demo.entity.Movie;
import lombok.Builder;
import lombok.ToString;

import javax.persistence.criteria.CriteriaBuilder;

@ToString
public class MovieDto {

    private Integer movie_id;

    private String title;

    private String genre;

    private String plot;

    public Movie toEntity() {
        return new Movie(movie_id, title, genre, plot);
    }

    @Builder
    public MovieDto(Integer movie_id, String title, String genre, String plot) {
        this.movie_id = movie_id;
        this.title = title;
        this.genre = genre;
        this.plot = plot;
    }
}
