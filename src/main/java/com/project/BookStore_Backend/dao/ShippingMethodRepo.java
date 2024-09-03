package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Review;
import com.project.BookStore_Backend.entity.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingMethodRepo extends JpaRepository<ShippingMethod,Integer> {
}
