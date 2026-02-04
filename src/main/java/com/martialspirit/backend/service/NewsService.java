package com.martialspirit.backend.service;

import com.martialspirit.backend.model.News;
import com.martialspirit.backend.repository.NewsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

/**
 *
 */
@Service
public class NewsService {

    //Declaración
    private final NewsRepository repository;
    //Inyección
    public NewsService(NewsRepository repository) {
        this.repository = repository;
    }

    //Obtener las últimas 2 noticias
    public List<News> getLatestNews() {
        return repository.findTop2ByOrderByDateDesc();
    }

    /**
     * Obtenemos tdo del métdo del repository.
     * Tdo el contenido (sección noticias)
     * @return
     */
    public List<News> getAllNews() {
        return repository.findAllByOrderByDateDesc();
    }

    /**
     * Aqui hacemos posible obtenerlos por slug.
     * Para cada página individual de noticia.
     * @param slug
     * @return
     */
    public News getBySlug(String slug) {
        return repository.findBySlug(slug)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND, "News not found")
                );
    }

}