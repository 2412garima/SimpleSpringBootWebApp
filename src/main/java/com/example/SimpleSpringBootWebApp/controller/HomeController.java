package com.example.SimpleSpringBootWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    root
    @RequestMapping("/")
//    @ResponseBody
    public String greet()
    {
        return "Welcome!!";
    }

//    endpoint
    @RequestMapping("/about")
    public String about()
    {
        return "We don't teach, We Educate!!";
    }
}
