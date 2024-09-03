package com.project.BookStore_Backend;

import com.project.BookStore_Backend.dao.OrderDetailRepo;
import com.project.BookStore_Backend.entity.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BookStoreBackendApplicationTests {

	@Autowired
	private OrderDetailRepo orderDetailRepo;

	@Test
	void testOrderDetailRepo() {
		OrderDetail foundOrderDetail = orderDetailRepo.findById(1L).get();
		assertThat(foundOrderDetail).isEqualTo(foundOrderDetail);
	}
}