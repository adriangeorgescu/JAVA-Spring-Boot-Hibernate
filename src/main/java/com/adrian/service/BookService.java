package com.adrian.service;

import com.adrian.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.adrian.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public UUID add(Book book) {
        UUID isbn = UUID.randomUUID();
        book.setIsbn(isbn);
        this.bookRepository.save(book);
        return isbn;
    }

    public Iterable<Book> getAll() {
        return this.bookRepository.findAll();
    }

    public Optional<Book> get(UUID isbn) {
        return this.bookRepository.findByIsbn(isbn);
    }

    public boolean update(Book book) {
        Integer result = this.bookRepository.update(book.getTitle(), book.getAuthor(), book.getPublisher(), book.getRevision(), book.getPublishedAt(), book.getIsbn());
        return result != 0;
    }

    public boolean remove(UUID isbn) {
        Integer result = this.bookRepository.deleteByIsbn(isbn);
        return result != 0;
    }

}
