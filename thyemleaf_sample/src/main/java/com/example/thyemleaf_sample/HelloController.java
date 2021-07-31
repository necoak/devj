package com.example.thyemleaf_sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("greeting", new Greeting());
        return "hello";
    }

    @PostMapping("/hello")
    public String showMessage(@ModelAttribute Greeting greeting){
        return "message";
    }
}
