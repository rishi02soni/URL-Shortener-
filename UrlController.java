package com.project.urlshortener.controller;

import com.project.urlshortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/url")
public class UrlController {

    @Autowired
    private UrlService service;

    @PostMapping("/shorten")
    public String shorten(@RequestParam String url) {
        return service.shortenUrl(url);
    }

    @GetMapping("/{shortCode}")
    public String redirect(@PathVariable String shortCode) {
        return service.getOriginalUrl(shortCode);
    }
}
