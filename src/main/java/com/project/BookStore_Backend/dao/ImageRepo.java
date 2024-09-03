package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.FavoriteBook;
import com.project.BookStore_Backend.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<Image,Integer> {
}
