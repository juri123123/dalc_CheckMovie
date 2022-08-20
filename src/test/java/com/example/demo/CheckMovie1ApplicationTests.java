package com.example.demo;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheckMovie1ApplicationTests {

	@Autowired
	private MovieRepository movieRepository;

	@Test
	void contextLoads() {
		Movie m1 = new Movie();
		m1.setTitle("나니아연대기");
		m1.setGenre("판타지");
		m1.setPlot("어쩌구 저쩌구 환상과 모험의 이야기");
		this.movieRepository.save(m1);
	}

}
