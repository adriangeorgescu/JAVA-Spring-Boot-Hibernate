package com.adrian.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @GeneratedValue
    @Type(type = "uuid-char")
    private UUID isbn;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    private String publisher;

    private int revision;

    @JsonProperty("published_at")
    @Column(name = "published_at")
    private String publishedAt;

    protected Book() {
    }

    @JsonCreator
    public Book(@JsonProperty("id") int id, @JsonProperty("isbn") UUID isbn, @JsonProperty("title") String title, @JsonProperty("author") String author, @JsonProperty("publisher") String publisher, @JsonProperty("revision") int revision, @JsonProperty("published_at") String publishedAt) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.revision = revision;
        this.publishedAt = publishedAt;
    }

    public int getId() {
        return id;
    }

    public Book setId(final int id) {
        this.id = id;
        return this;
    }

    public UUID getIsbn() {
        return isbn;
    }

    public Book setIsbn(final UUID isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public int getRevision() {
        return revision;
    }

    public Book setRevision(int revision) {
        this.revision = revision;
        return this;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public Book setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }
}
