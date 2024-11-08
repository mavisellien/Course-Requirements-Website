package com.udemy.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/home")
    public String showHome() {
        return "home";
    }

    @GetMapping("/sbm")
    public String showSBM() {
        return "sbm";
    }

    @GetMapping("/biot")
    public String showBIOT() {
        return "biot";
    }

    @GetMapping("/comp")
    public String showCOMP() {
        return "comp";
    }
}