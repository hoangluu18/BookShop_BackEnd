package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.ShippingMethod;
import com.project.BookStore_Backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
