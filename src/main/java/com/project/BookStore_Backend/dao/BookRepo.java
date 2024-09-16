package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.BookStore_Backend.entity.Book;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Pageable;

@RepositoryRestResource(path = "book")
public interface BookRepo extends JpaRepository<Book, Integer> {
    Page<Book> findBookByBookTitleContaining(@RequestParam("bookTitle") String bookTitle, Pageable pageable);
    Page<Book> findBookByCategoryList_categoryId(@RequestParam("categoryId") int categoryId, Pageable pageable);
    Page<Book> findBookByBookTitleContainingAndCategoryList_categoryId(@RequestParam("bookTitle") String bookTitle, @RequestParam("categoryId") int categoryId, Pageable pageable);
}