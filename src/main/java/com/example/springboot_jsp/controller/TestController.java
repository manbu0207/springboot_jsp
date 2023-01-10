package com.example.springboot_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("info","jsp测试成功");
        return "page";
    }
}
