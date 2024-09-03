package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Image;
import com.project.BookStore_Backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {
}
