package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Permission;
import com.project.BookStore_Backend.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource (path = "review")
public interface ReviewRepo extends JpaRepository<Review,Long> {
}
