package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.ShippingMethod;
import com.project.BookStore_Backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource (path = "user")
public interface UserRepo extends JpaRepository<User,Integer> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
