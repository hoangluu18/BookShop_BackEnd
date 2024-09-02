package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.util.List;

@Data
public class Permission {
    private int permissionId;

    private String permissionName;
    List<User> userList;
}
