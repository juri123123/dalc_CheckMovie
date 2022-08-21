package com.example.demo.controller;
import com.example.demo.service.MovieService;
import com.example.demo.dto.CheckMovieDto;
import com.example.demo.entity.CheckMovie;
import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/recommend")
    public String recommend() {
        return "03-recommend";
    }

    //movie check 한 것 -> checkmovieDto
    @GetMapping("/moviecheck")
    public String checkMovie(CheckMovieDto checkmovieDto) {
        CheckMovie checkMovie = movieService.savemovie(checkmovieDto); // 선택한 것 저장 -> checkmovieRepository
        return "";
    }


    //db에 저장된 전체 영화 목록 -> MovieDto
    @RequestMapping("/movieAll")
    public String allMovie(Model model) {
        List<Movie> movieList = movieRepository.findAll(); //- > movieRepository
        model.addAttribute("movieList", movieList);

        return "index2"; // 목록
    }

}