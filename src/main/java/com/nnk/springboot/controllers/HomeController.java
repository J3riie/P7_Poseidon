package com.nnk.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/admin/home")
    public String adminHome(Model model) {
        // TODO uniquement user avec role admin
        return "redirect:/bidList/list";
    }

}