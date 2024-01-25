package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String hello(ModelMap model) {
        model.addAttribute("hello_attr1", "hello!!!");
        return "hello";
    }

    @RequestMapping("/bye")
    public String bye(ModelMap model) {
        model.addAttribute("bye_attr1", "bye!!!");
        return "bye";
    }
}
