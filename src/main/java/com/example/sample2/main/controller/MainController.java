package com.example.sample2.main.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String main(Model model) throws Exception {
        System.out.println("11111111111111");
        return "main";
    }

    @GetMapping("/hello")
    public String hello(Model model) throws Exception {
        System.out.println("2222222");
        return "hello";
    }
}
