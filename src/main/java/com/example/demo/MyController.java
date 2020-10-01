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
        return ("News2");
    }

    @GetMapping("/About")
    public String about(){
        return ("About");
    }

    @GetMapping("/YourHelp")
    public String yourHelp (){
        return ("YourHelp");
    }

    //Artikler
    @GetMapping("/one")
    public String one (){
        return ("one");
    }

    @GetMapping("/two")
    public String two (){
        return ("two");
    }

    @GetMapping("/three")
    public String three (){
        return ("three");
    }

    @GetMapping("/four")
    public String four (){
        return ("four");
    }

    @GetMapping("/five")
    public String five (){
        return ("five");
    }

    @GetMapping("/six")
    public String six (){
        return ("six");
    }
}
