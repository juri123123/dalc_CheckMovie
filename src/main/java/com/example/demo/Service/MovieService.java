package com.example.demo.Service;

import com.example.demo.dto.MovieDto;
import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    // 선택한 영화 저장
    public Movie savemovie(MovieDto movieDto) {
        Movie movie = movieDto.toEntity();
        return movieRepository.save(movie);
    }

    // 전체 영화 목록 가져오기
    @Transactional
    public List<MovieDto> getMovieList() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> movieDtoList = new ArrayList<>();

        for(Movie movie : movies) {
            MovieDto movieDto = MovieDto.builder()
                    .movie_id(movie.getMovie_id())
                    .title(movie.getTitle())
                    .genre(movie.getGenre())
                    .plot(movie.getPlot())
                    .build();

            movieDtoList.add(movieDto);
        }

        return movieDtoList;
    }
}
