package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @PostMapping("/panda")
    public String getdata(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 + num2;
        return "result=" + result;
    }
}