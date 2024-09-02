package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.sql.Blob;

@Data
public class Image {
    private int imageId;
    private String imageName;
    private boolean isMainImage;
    private String link;
    private String data;

    private Book book;

}
