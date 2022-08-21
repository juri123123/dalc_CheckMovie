package com.example.demo.controller;

import com.example.demo.Service.MovieService;
import com.example.demo.dto.MovieDto;
import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieService movieService;

    @RequestMapping("/recommend")
    public String recommend() {
        return "03-recommend";
    }

    //movie check 한 것
    @GetMapping("/moviecheck")
    public String checkMovie(MovieDto movieDto) {
        Movie movie = movieService.savemovie(movieDto); // 선택한 것 저장
        return "";
    }


    //db에 저장된 전체 영화 목록
    @GetMapping("/movieAll")
    public String allMovie(Model model) {
        List<Movie> movieList = movieRepository.findAll();
        model.addAttribute("MovieList", movieList); // addattribute 부분 front 에서 구현 필요

        return "02-checkmovie"; // 목록
    }
}
