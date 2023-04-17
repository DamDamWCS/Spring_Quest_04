package com.wcs.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.books.entity.Book;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String title, String description);
}
