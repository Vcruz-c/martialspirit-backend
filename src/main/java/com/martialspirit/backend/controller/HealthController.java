package com.martialspirit.backend.controller;


import com.martialspirit.backend.model.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 *
 */
@RestController
@RequestMapping("/api/health")
public class HealthController {


    /**
     * Primero controlador
     * @return
     */
    @GetMapping
    public String health() {
        return "OK";
    }

    /**
     * Controlador de prueba
     * @return
     */
    @GetMapping("/mock")
    public News mock() {
        return new News(
                1L,
                "torneo-regional-2024",
                "Gran actuación en el Torneo Regional",
                "Nuestros atletas lograron resultados destacados...",
                "Contenido completo de la noticia",
                LocalDate.now()
        );
    }

}


