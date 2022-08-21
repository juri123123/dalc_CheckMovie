package com.example.demo.dto;

import com.example.demo.entity.CheckMovie;
import com.example.demo.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class CheckMovieDto {

    private Integer movie_id;

    private String title;

    private String genre;

    private String plot;

    public CheckMovie toEntity() {
        return new CheckMovie(movie_id, title, genre, plot);
    }
}
