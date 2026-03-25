package com.project.urlshortener.service;

import com.project.urlshortener.model.Url;
import com.project.urlshortener.repository.UrlRepository;
import com.project.urlshortener.util.Base62Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;

    public String shortenUrl(String originalUrl) {
        Url url = new Url();
        url.setOriginalUrl(originalUrl);
        repository.save(url);

        String shortCode = Base62Encoder.encode(url.getId());
        url.setShortUrl(shortCode);
        repository.save(url);

        return shortCode;
    }

    public String getOriginalUrl(String shortCode) {
        return repository.findByShortUrl(shortCode)
                .map(Url::getOriginalUrl)
                .orElse("Not Found");
    }
}
