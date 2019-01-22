package com.adrian.dao;

import com.adrian.entity.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, Integer> {
    Optional<Book> findByIsbn(UUID isbn);

    @Transactional
    Integer deleteByIsbn(UUID isbn);

    @Transactional
    @Modifying
    @Query("UPDATE Book b set b.title = ?1, b.author = ?2, b.publisher = ?3, b.revision = ?4, b.publishedAt = ?5 WHERE isbn = ?6")
    Integer update(String title, String author, String publisher, Integer revision, String published_at, UUID isbn);

}
