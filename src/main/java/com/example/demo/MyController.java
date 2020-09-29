package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String home(){
        return ("Home");
    }

    @GetMapping("/News")
    public String news(){
        return ("News");
    }

    @GetMapping("/About")
    public String about(){
        return ("About");
    }

    @GetMapping("/YourHelp")
    public String yourHelp (){
        return ("YourHelp");
    }
}
