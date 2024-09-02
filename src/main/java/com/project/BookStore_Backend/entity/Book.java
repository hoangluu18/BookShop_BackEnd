package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private int bookId;
    private String bookTitle;
    private String authorName;
    private String ISBN;
    private String description;
    private double coverPrice; //gia niem yet
    private double sellingPrice;//gia ban
    private int quantity;
    private Double averageRating;

    List<Category> categoryList;
    List<Image> imageList;
    List<Review> reviewList;
    List<OrderDetail> orderDetailList; //chi tiet don hang
    //List<CartDetail>  cartDetailList; //chi tiet gio hang
    List<FavoriteBook> favoriteBookList; // danh sach sach yeu thich
}



