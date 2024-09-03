package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Permission;
import com.project.BookStore_Backend.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review,Long> {
}
