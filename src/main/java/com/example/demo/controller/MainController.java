package com.example.demo.controller;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/01-main-origin.html")
    public String index(Model model) {
        List<Movie> newmovieList = movieRepository.findAll(); //- > movieRepository
        model.addAttribute("newmovieList", newmovieList);

        return "01-main-origin";
    }
}
