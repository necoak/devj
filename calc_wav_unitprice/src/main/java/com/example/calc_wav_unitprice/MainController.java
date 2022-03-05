package com.example.calc_wav_unitprice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "hello");
        model.addAttribute("member01", new Member());

        model.addAttribute("settings", new Settings());
        return "input";
    }

    @PostMapping("/calc")
    public String calc(Model model, @ModelAttribute Settings totalSettings){
        return "result";
    }

}