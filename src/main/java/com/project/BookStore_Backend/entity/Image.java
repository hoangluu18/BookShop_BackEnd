package com.project.BookStore_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;

@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @Column(name = "image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    @Column(name = "image_name", length = 256)
    private String imageName;

    @Column(name = "main_image")
    private boolean isMainImage;

    @Column(name = "link")
    private String link;
    @Column(name = "data", columnDefinition = "LONGTEXT")
    @Lob
    private String data;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "book_id",nullable = false)
    private Book book;

}
