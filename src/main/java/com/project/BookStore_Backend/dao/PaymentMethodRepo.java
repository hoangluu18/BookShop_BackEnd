package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.OrderDetail;
import com.project.BookStore_Backend.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodRepo extends JpaRepository<PaymentMethod,Integer> {
}
