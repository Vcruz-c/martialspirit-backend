package com.martialspirit.backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 *
 */
@Entity
@Table(name = "news")
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String slug;

    private String title;

    private String excerpt;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDate date;

    /**
     * Constructor por defecto
     */
    public News() {
    }

    /**
     *
     * @param id
     * @param slug
     * @param title
     * @param excerpt
     * @param content
     * @param date
     */
    public News(Long id, String slug, String title, String excerpt, String content, LocalDate date) {
        this.id = id;
        this.slug = slug;
        this.title = title;
        this.excerpt = excerpt;
        this.content = content;
        this.date = date;
    }

    /*
     * Getters y Setters
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
