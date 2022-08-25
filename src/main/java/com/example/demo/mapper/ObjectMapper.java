package com.example.demo.mapper;

import com.example.demo.dto.GetFlaskDto;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.File;

public class ObjectMapper {
    //convert java object to json
    GetFlaskDto.request flaskDto = new GetFlaskDto.request();

    public GetFlaskDto.request getFlaskDto() throws JsonProcessingException {
        flaskDto.setMovie_id(2);
        flaskDto.setTitle("title");
        flaskDto.setMovie_img("image");

        com.fasterxml.jackson.databind.ObjectMapper test = new com.fasterxml.jackson.databind.ObjectMapper();
        //문자열 출력
        String s = test.writeValueAsString(flaskDto);


        //
        com.fasterxml.jackson.databind.ObjectMapper test2 = new com.fasterxml.jackson.databind.ObjectMapper();
//        GetFlaskDto.response response = test2.readValue();

        return flaskDto;
    }



}
