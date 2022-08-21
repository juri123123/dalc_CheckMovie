package com.example.demo.Service;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // 책 저장
    public Book savebook(BookDto bookDto) {
        Book book = bookDto.toEntity();

        return bookRepository.save(book);
    }
}
