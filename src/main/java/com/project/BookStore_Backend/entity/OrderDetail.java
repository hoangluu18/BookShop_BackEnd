package com.project.BookStore_Backend.entity;

import lombok.Data;

@Data
public class OrderDetail { //chi tiet don hang
    private long orderDetailId;

    private int quantity;
    private double price;


    private Book book;
    private Order order;

}
