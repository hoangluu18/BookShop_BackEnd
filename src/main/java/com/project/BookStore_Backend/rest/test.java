package com.project.BookStore_Backend.rest;

import com.project.BookStore_Backend.dao.BookRepo;
import com.project.BookStore_Backend.dao.OrderDetailRepo;
import com.project.BookStore_Backend.entity.Book;
import com.project.BookStore_Backend.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class test {
    private BookRepo orderDetailRepo;

    @Autowired
    public test(BookRepo orderDetailRepo) {
        this.orderDetailRepo = orderDetailRepo;
    }

    @GetMapping("/test")
    public String testOrderDetailRepo() {
        Optional<Book> book = orderDetailRepo.findById(1);
        return "Number of OrderDetail records: " + book.get();
    }
}
