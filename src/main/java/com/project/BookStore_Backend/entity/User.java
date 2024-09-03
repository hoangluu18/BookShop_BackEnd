package com.project.BookStore_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "username")
    private String lastName; //ho
    @Column(name = "first_name")
    private  String firstName; //ten
    @Column(name = "password", length = 512)
    private String password;
    @Column(name = "gender")
    private char gender;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "purchase_address")
    private String purchaseAddress; //dia chi mua hang
    @Column(name = "delivery_address")
    private String deliveryAddress; //dia chi giao hang


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    private  List<Review> reviewList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    private  List<FavoriteBook> favoriteBookList;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinTable(
            name = "user_permission",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private List<Permission> permissionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })

    private List<Order> orderList; //danh sach don hang

}
