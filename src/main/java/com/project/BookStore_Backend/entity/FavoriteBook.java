package com.project.BookStore_Backend.entity;

import lombok.Data;

@Data
public class FavoriteBook {
    private int favoriteBookId;

    private User user;
    private Book book;
}
