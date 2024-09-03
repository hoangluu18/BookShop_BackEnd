package com.project.BookStore_Backend.dao;

import com.project.BookStore_Backend.entity.PaymentMethod;
import com.project.BookStore_Backend.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepo extends JpaRepository<Permission,Integer> {
}
