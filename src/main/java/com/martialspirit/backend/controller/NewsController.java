package com.martialspirit.backend.controller;

import com.martialspirit.backend.model.News;
import com.martialspirit.backend.service.NewsService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/api/news")
public class NewsController {

    //Declaración de dependencia
    private final NewsService newsService;
    //Inyección de dependencia
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    // Home → últimas 2
    @GetMapping("/latest")
    public List<News> latest() {
        return newsService.getLatestNews();
    }

    // Página /news. Todas las noticias
    @GetMapping
    public List<News> all() {
        return newsService.getAllNews();
    }

    // Página detalle
    @GetMapping("/{slug}")
    public News bySlug(@PathVariable String slug) {
        return newsService.getBySlug(slug);
    }
}