package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
