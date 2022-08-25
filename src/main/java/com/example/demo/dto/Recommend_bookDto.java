package com.example.demo.dto;

import com.example.demo.entity.Recommend_book;

public class Recommend_bookDto {
    private Integer book_id;

    private String title;

    private String description;

    private String book_img;

    public Recommend_book toEntity() {
        return new Recommend_book(book_id, title, description, book_img);
    }

}
