package com.example.demo.repository;

import com.example.demo.entity.Recommend_book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Recommend_bookRepository extends JpaRepository<Recommend_book, Integer>{
}
