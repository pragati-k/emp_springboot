package com.nagarro.cart_service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.nagarro.cart_service.controller.HomeController;

@SpringBootTest
class HomeServiceApplicationTests {

	@Test
	void contextLoads() {
		HomeController cartController = new HomeController();
		String result = cartController.home();
        assertEquals(result, "Hello World!");
	}

}
