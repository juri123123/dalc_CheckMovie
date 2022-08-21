package com.example.demo.service;

import com.example.demo.dto.CheckMovieDto;
import com.example.demo.dto.MovieDto;
import com.example.demo.entity.CheckMovie;
import com.example.demo.entity.Movie;
import com.example.demo.repository.CheckMovieRepository;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private CheckMovieRepository checkMovieRepository;

    // 선택한 영화 저장 -> checkmovieRepository
    public CheckMovie savemovie(CheckMovieDto checkmovieDto) {
        CheckMovie checkmovie = checkmovieDto.toEntity();
        return checkMovieRepository.save(checkmovie);
    }

    //영화 일부(1~5) 가져오기 -> movieRepository
    public List<Movie> getPartMovieList(MovieDto movieDto) {
        Movie movie = movieDto.toEntity();
        List<Movie> movieDtoList = new ArrayList<>();
        for(Integer movie_id = 1; movie_id >= 5;movie_id++) {
            Movie target = movieRepository.findById(movie_id).orElse(null);
            movieDtoList.add(target);
        }
        return movieDtoList;
    }

    // 전체 영화 목록 가져오기 -> movieRepository
    @Transactional
    public List<MovieDto> getMovieList() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> movieDtoList = new ArrayList<>();

        for(Movie movie : movies) {
            MovieDto movieDto = MovieDto.builder()
                    .movie_id(movie.getMovie_id())
                    .title(movie.getTitle())
                    .movie_img(movie.getMovie_img())
                    .build();

            movieDtoList.add(movieDto);
        }

        return movieDtoList;
    }
}