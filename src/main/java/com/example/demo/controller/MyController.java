package com.example.demo.controller;

import com.example.demo.services.WasteCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    WasteCalculator wasteCalculator = new WasteCalculator();

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("totalWaste",wasteCalculator.totalWasteThisYearInTons());
        model.addAttribute("householdWaste", wasteCalculator.householdsCombinedWasteThisYearInTons());
        model.addAttribute("personWaste", wasteCalculator.averagePersonWasteThisYearInKG());
        model.addAttribute("currentYear", wasteCalculator.getCurrentYear());
        return ("Home");
    }

    @GetMapping("/News2")
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
        return ("news/one");
    }

    @GetMapping("/two")
    public String two (){
        return ("news/two");
    }

    @GetMapping("/three")
    public String three (){
        return ("news/three");
    }

    @GetMapping("/four")
    public String four (){
        return ("news/four");
    }

    @GetMapping("/five")
    public String five (){
        return ("news/five");
    }

    @GetMapping("/six")
    public String six (){
        return ("news/six");
    }
}
