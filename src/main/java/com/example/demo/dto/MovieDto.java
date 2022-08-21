package com.example.demo.dto;

import com.example.demo.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MovieDto {

    private Integer movie_id;

    private String title;

    private String genre;

    private String plot;

    public Movie toEntity() {
        return new Movie(movie_id, title, genre, plot);
    }
}
