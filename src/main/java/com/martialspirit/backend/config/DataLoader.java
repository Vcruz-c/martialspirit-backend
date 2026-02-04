package com.martialspirit.backend.config;

import com.martialspirit.backend.model.News;
import com.martialspirit.backend.repository.NewsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataLoader {

    /**
     * Datos iniciales para desarrollo.
     * (Se eliminarán cuando el frontend esté conectado)
     */
//    @Bean
//    CommandLineRunner loadData(NewsRepository repo) {
//        return args -> {
//
//            repo.save(new News(
//                    null,
//                    "torneo-regional-2025",
//                    "Gran actuación en el Torneo Regional",
//                    "Nuestros atletas lograron resultados destacados en el último torneo regional.",
//                    "Contenido completo de la noticia sobre el torneo regional.",
//                    LocalDate.of(2024, 11, 10)
//            ));
//
//            repo.save(new News(
//                    null,
//                    "nuevo-horario-invierno",
//                    "Nuevo horario de invierno",
//                    "Actualizamos los horarios de entrenamiento para la temporada de invierno.",
//                    "Detalle completo de los nuevos horarios de invierno y grupos.",
//                    LocalDate.of(2024, 10, 28)
//            ));
//
//            repo.save(new News(
//                    null,
//                    "seminario-defensa-personal",
//                    "Seminario especial de defensa personal",
//                    "Organizamos un seminario intensivo de defensa personal abierto a todos los niveles.",
//                    "Información completa sobre el seminario, fechas y contenido.",
//                    LocalDate.of(2024, 9, 15)
//            ));
//
//            repo.save(new News(
//                    null,
//                    "apertura-nueva-sala",
//                    "Inauguración de la nueva sala de entrenamiento",
//                    "Ampliamos nuestras instalaciones con una nueva sala totalmente equipada.",
//                    "Detalles completos sobre la nueva sala y mejoras en la academia.",
//                    LocalDate.of(2024, 8, 5)
//            ));
//        };
//    }
}