package com.example.urlshortener.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UrlController {

    @GetMapping("/test")
    public String test() {
        return "✅ URL Shortener Backend is Working!";
    }
}
