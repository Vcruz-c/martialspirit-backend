package com.martialspirit.backend.repository;

import com.martialspirit.backend.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 *
 */
public interface NewsRepository extends JpaRepository<News, Long> {

    Optional<News> findBySlug(String slug);//Obtener por sulg
    List<News> findTop2ByOrderByDateDesc();//últimas 2 noticias
    List<News> findAllByOrderByDateDesc();//Obtener tdo por orden
}