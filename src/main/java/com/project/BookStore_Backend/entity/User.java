package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class User {
    private int userId;
    private String lastName; //ho

    private  String firstName; //ten

    private String password;

    private char gender;

    private String email;

    private String phone;

    private String purchaseAddress; //dia chi mua hang
    private String deliveryAddress; //dia chi giao hang

    private  List<Review> reviewList;
    private  List<FavoriteBook> favoriteBookList;

    private List<Permission> permissionList;

    //private List<Cart> cartList; //danh sach gio hang

    private List<Order> orderList; //danh sach don hang

}
