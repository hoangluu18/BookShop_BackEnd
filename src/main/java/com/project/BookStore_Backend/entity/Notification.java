package com.project.BookStore_Backend.entity;

public class Notification {
    private String content;

    public Notification(String content) {
        this.content = content;
    }

    public Notification() {
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
