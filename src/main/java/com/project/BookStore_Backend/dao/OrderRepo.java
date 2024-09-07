package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Image;
import com.project.BookStore_Backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource (path = "order")
public interface OrderRepo extends JpaRepository<Order,Integer> {
}
