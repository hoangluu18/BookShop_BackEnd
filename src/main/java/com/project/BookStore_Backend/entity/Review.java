package com.project.BookStore_Backend.entity;

import lombok.Data;

@Data
public class Review {
    private long reviewId;

    private float rating;
    private String reviewContent;

    private User user;
    private Book book;
}
