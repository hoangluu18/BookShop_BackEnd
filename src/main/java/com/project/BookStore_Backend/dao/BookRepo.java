package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.BookStore_Backend.entity.Book;
@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}
