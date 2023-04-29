package com.example.Thymeleaf.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

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

    //handling iteration
    @GetMapping("/loop")
    public ModelAndView iteratorHandler(Model model){

        List<String> nameOfList = List.of("ankur", "singh", "pundir", "ankit", "rahul");
        model.addAttribute("names",nameOfList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("iterator");
        return modelAndView;

    }
    @GetMapping("/fragment")
    public ModelAndView fragmentHandler(Model model){

        model.addAttribute("title","i like samosa");
        model.addAttribute("subtitle", LocalDateTime.now().toString());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pragment");
        return modelAndView;

    }

}



