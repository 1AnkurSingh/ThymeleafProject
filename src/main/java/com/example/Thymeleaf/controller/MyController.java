package com.example.Thymeleaf.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
public class MyController {
    @GetMapping("/about")
    public ModelAndView about(Model model) {

        // putting data in model
        model.addAttribute("name","ankur singh");
        model.addAttribute("currentDate" ,new Date().toLocaleString());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about");
        return modelAndView;
    }

}



