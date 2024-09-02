package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.util.List;

@Data
public class Category {

    private int categoryId;
    private String categoryName;
    private List<Book> bookList;
}
