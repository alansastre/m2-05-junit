package com.example.javiergonzalez;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.strategy.PaymentStrategy;
import com.example.demo.patterns.behavioral.strategy.Product;
import com.example.demo.patterns.behavioral.strategy.ShopCart;

class ShopCartTest {

	ShopCart tienda = new ShopCart();
	Product product1 = new Product("Galletass", 0.9d);
	Product product2 = new Product("Agua", 1d);
	Product product3 = new Product("pan", 0.6d);
	List<Product> products;
	
	//PaymentStrategy paymentStrategy = new PaymentStrategy();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testShopCart() {

		ShopCart tienda = new ShopCart();


	}

	@Test
	void testAddProduct() {
		tienda.addProduct(product1);
		if (tienda != null) {
			products.add(product1);
			tienda.addProduct(product1);
			assertNull(products);
		} else {
			assertNotNull(products);
			System.out.println("testAddProduct");
		}
	}

	@Test
	void testRemoveProduct() {
		// fail("Not yet implemented");
		System.out.println("testRemoveProduct");
		assertNull(products);
		tienda.removeProduct(product1);
	}

	@Test
	void testPay() {
		ShopCart shop = new ShopCart();
	}

}
