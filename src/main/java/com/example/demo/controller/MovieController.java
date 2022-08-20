package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {

    @RequestMapping("/recommend")
    public String recommend() {
        return "03-recommend";
    }
}
