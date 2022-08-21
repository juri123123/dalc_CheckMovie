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
		m1.setTitle("미니언즈2");
		m1.setMovie_img("https://search.pstatic.net/common?type=o&amp;size=174x242&amp;quality=85&amp;direct=true&amp;src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20220720_283%2F1658284839003UzxoT_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		this.movieRepository.save(m1);

		Movie m2 = new Movie();
		m2.setTitle("아이언 크로스: 노르망디 상륙작전");
		m2.setMovie_img("https://search.pstatic.net/common?type=o&amp;size=174x242&amp;quality=85&amp;direct=true&amp;src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20220706_200%2F1657075111416vYByP_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		this.movieRepository.save(m2);

		Movie m3 = new Movie();
		m3.setTitle("외계+인 1부");
		m3.setMovie_img("https://search.pstatic.net/common?type=o&amp;size=174x242&amp;quality=85&amp;direct=true&amp;src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20220708_75%2F16572722362230AyHS_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		this.movieRepository.save(m3);

		Movie m4 = new Movie();
		m4.setTitle("메기");
		m4.setMovie_img("https://search.pstatic.net/common?type=ofullfill&amp;size=174x242&amp;quality=85&amp;direct=true&amp;src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20190104_124%2F1546579539347OXdoL_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		this.movieRepository.save(m4);

		Movie m5 = new Movie();
		m5.setTitle("헤어질 결심");
		m5.setMovie_img("https://search.pstatic.net/common?type=o&amp;size=174x242&amp;quality=85&amp;direct=true&amp;src=https%3A%2F%2Fs.pstatic.net%2Fmovie.phinf%2F20220607_129%2F16545872892918GA4h_JPEG%2Fmovie_image.jpg%3Ftype%3Dw640_2");
		this.movieRepository.save(m5);
	}

}
