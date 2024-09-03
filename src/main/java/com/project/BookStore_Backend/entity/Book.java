package com.project.BookStore_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

import java.util.List;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;
    @Column(name = "book_title", length = 256)
    private String bookTitle;
    @Column(name = "author_name", length = 512)
    private String authorName;
    @Column(name = "isbn", length = 256)
    private String ISBN;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "cover_price")
    private double coverPrice; //gia niem yet
    @Column(name = "selling_price")
    private double sellingPrice;//gia ban
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "average_rating")
    private Double averageRating;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    List<Category> categoryList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Image> imageList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval  = true)
    List<Review> reviewList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    List<OrderDetail> orderDetailList; //danh sach chi tiet don hang

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book", cascade = CascadeType.ALL)
    List<FavoriteBook> favoriteBookList; // danh sach sach yeu thich
}



