package com.example.demoapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;


@Controller
public class HelloController {
    @Autowired
    MessageSource messageSource;

    @RequestMapping(path = "hello", method = RequestMethod.GET)
    public String hello(Model model, Locale locale){
        model.addAttribute("title", messageSource.getMessage("app.title", null, locale));
        model.addAttribute("hello", "Hello World!");
        return "hello";
    }
}
