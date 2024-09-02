package com.project.BookStore_Backend;

import com.project.BookStore_Backend.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookStoreBackendApplicationTests {

	@Test
	void contextLoads() {
		Category category = new Category();
		category.setCategoryId(1);
		category.setCategoryName("Fiction");

		System.out.println(category);
	}

}
