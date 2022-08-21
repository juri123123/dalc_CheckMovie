package com.example.demo.dto;

import com.example.demo.entity.Book;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class BookDto {
    private Integer book_id;

    private String title;

    private String description;

    private String book_img;

    public Book toEntity() {
        return new Book(book_id, title, description, book_img);
    }
}