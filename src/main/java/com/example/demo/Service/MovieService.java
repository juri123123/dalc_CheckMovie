package com.example.demo.Service;

import com.example.demo.dto.MovieDto;
import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    // 선택한 영화 저장
    public Movie savemovie(MovieDto movieDto) {
        Movie movie = movieDto.toEntity();

        return movieRepository.save(movie);
    }
}
