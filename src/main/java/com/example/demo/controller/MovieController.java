package com.example.demo.controller;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
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

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/03-recommend.html")
    public String recommend(Model model) {
        List<Book> bookList = bookRepository.findAll(); //- > bookRepository
        model.addAttribute("bookList", bookList);

        return "03-recommend";
    }

    @RequestMapping("/02-1-checkmovie_result.html")
    public String result(Model model) {
        List<Book> bookList = bookRepository.findAll(); //- > bookRepository
        model.addAttribute("bookList", bookList);

        return "02-1-checkmovie_result";
    }

    @RequestMapping("/05-1-mybook-recommended-books.html")
    public String mybooks_recommended(Model model) {
        List<Book> bookList = bookRepository.findAll(); //- > bookRepository
        model.addAttribute("bookList", bookList);

        return "05-1-mybook-recommended-books";
    }

    @RequestMapping("/05-2-mybook-recommended-movies.html")
    public String mymovie_recommended(Model model) {
        List<Movie> movieList = movieRepository.findAll(); //- > movieRepository
        model.addAttribute("movieList", movieList);

        return "05-2-mybook-recommended-movies";
    }

    @RequestMapping("/05-3-mybook-mypicks.html")
    public String mypick(Model model) {
        List<Book> bookList = bookRepository.findAll(); //- > bookRepository
        model.addAttribute("bookList", bookList);

        return "05-3-mybook-mypicks";
    }

    @RequestMapping("/05-Mybook.html")
    public String mybooks(Model model) {
        List<Book> bookList = bookRepository.findAll(); //- > bookRepository
        model.addAttribute("bookList", bookList);

        List<Movie> movieList = movieRepository.findAll(); //- > movieRepository
        model.addAttribute("movieList", movieList);

        return "05-Mybook";
    }

    @RequestMapping("/09-coming-up.html")
    public String comingup(Model model) {
        List<Movie> movieList = movieRepository.findAll(); //- > movieRepository
        model.addAttribute("movieList", movieList);

        return "09-coming-up";
    }

    //db에 저장된 전체 영화 목록
    @RequestMapping("/02-checkmovie.html")
    public String allMovie(Model model) {
        List<Movie> movieList = movieRepository.findAll(); //- > movieRepository
        model.addAttribute("movieList", movieList);

        return "02-checkmovie"; // 목록
    }

    //check 한거 checkmovieRepository로
    @PostMapping("/02-checkmovie.html")
    public String checkmovietoForm(CheckMovieDto checkmovieDto) {
        CheckMovie checkMovie = movieService.savemovie(checkmovieDto); // checkmovierepository 로 저장

        return "02-1-checkmovie_result";
    }

    //2
    @RequestMapping("/02-checkmovie-2.html")
    public String allMovie2(Model model) {
        List<Movie> movieList = movieRepository.findAll(); //- > movieRepository
        model.addAttribute("movieList", movieList);

        return "02-checkmovie-2"; // 목록
    }

    @PostMapping("/02-checkmovie-2.html")
    public String checkmovietoForm2(CheckMovieDto checkmovieDto) {
        CheckMovie checkMovie = movieService.savemovie(checkmovieDto); // checkmovierepository 로 저장

        return "02-1-checkmovie_result";
    }

}