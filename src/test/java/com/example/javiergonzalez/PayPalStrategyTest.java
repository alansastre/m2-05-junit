package com.example.javiergonzalez;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.strategy.PayPalStrategy;
import com.example.demo.patterns.behavioral.strategy.ShopCart;

class PayPalStrategyTest {

	PayPalStrategy paypal = new PayPalStrategy("www.google.com","lil","74125874125871");
	
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}

//	@Test
//	void testPayPalStrategy() {
//		PayPalStrategy paypal2 = new PayPalStrategy("api1","lil","74125874125871");
//		paypal2.getClass();
//		assertNotNull(paypal2);
//	}

	
	@Test
	void testPay() {
		
		double result = paypal.pay(50d);
		assertEquals(250, result);
	}
	/*@Test
	void testGetApi() {
		if(paypal.getApi() != "") {
			assertNotNull(paypal);
		}else {
			assertNull(paypal);
		}
	}

	@Test
	void testSetApi() {
		paypal.setApi("cambio 1");
	}

	@Test
	void testGetUser() {
		if(paypal.getUser() != "") {
			assertNotNull(paypal);
		}else {
			assertNull(paypal);
		}
	}

	@Test
	void testSetUser() {
		paypal.setUser("prueba 2");
	}

	@Test
	void testGetToken() {
		if(paypal.getToken() != "") {
			assertNotNull(paypal);
		}else {
			assertNull(paypal);
		}
	}

	@Test
	void testSetToken() {
		paypal.setToken("777777771");
	}*/

//	@Test
//	void testPay() {
//		paypal.pay(0);
//		if(paypal != null)
//			assertNull("Tiene valor: ", paypal);
//		else 
//			assertNotNull("Esta vacio: ", paypal);
//	}

}
