package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.Review;
import com.project.BookStore_Backend.entity.ShippingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource (path = "shipping_method")
public interface ShippingMethodRepo extends JpaRepository<ShippingMethod,Integer> {
}
