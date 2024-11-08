package com.udemy.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    //add access denied

    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }

}
