package com.example.demo.repository;

import com.example.demo.entity.Book;
import com.example.demo.entity.CheckMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckMovieRepository extends JpaRepository<CheckMovie, Integer> {

}