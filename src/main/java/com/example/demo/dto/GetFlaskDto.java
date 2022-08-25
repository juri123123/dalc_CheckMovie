package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetFlaskDto {
    //flask로 request를 보내고 response를 받아오기 위한 object

    @Setter
    @Getter
    public static class request{
        private int movie_id;
        private String title;
        private String movie_img;
    }

    @Setter
    @Getter
    public static class response {
        private int book_id;
        private String title;
        private String description;
        private String book_img;
    }
}
