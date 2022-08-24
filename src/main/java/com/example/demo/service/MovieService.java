package com.example.demo.service;

import com.example.demo.dto.MovieDto;
import com.example.demo.entity.Movie;
import com.example.demo.repository.CheckMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private CheckMovieRepository checkMovieRepository;

    // 선택한 영화 저장 -> checkmovieRepository
    public Movie savemovie(MovieDto movieDto) {
        Movie movie = movieDto.toEntity();
        return checkMovieRepository.save(movie);
    }
}