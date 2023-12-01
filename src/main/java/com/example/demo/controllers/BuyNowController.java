package com.example.demo.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyNowController {
    @GetMapping("/buyNow")
    public String buyNow() {
        return "buy_now";
    }
}
