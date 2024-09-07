package com.project.BookStore_Backend;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookStoreBackendApplication.class, args);
	}

}
