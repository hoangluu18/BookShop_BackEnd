package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
@RepositoryRestResource (path = "category")
public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
