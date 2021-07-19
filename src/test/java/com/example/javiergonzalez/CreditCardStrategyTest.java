package com.example.javiergonzalez;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.strategy.CreditCardStrategy;

class CreditCardStrategyTest {
	   
	CreditCardStrategy credCar1 = new CreditCardStrategy("Javi", "1122334455", "124", "02/11/2020");

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
	void testCreditCardStrategy() {
		
		CreditCardStrategy credCar2 = new CreditCardStrategy(null,null,null,null);

		if(credCar1 != null) {
			assertNull(credCar1);
		}else {
			assertNotNull(credCar1);
		}
	}
/*
	@Test
	void testGetName() {
		if(credCar1.getName() != "") {
			assertNotNull(credCar1);
		}else {
			assertNull(credCar1);
		}
	}

	@Test
	void testSetName() {
		credCar1.setName("prueba 2");
		assertEquals("prueba 2", credCar1.getName());
	}

	@Test
	void testGetCardNumber() {
		if(credCar1.getCardNumber() != "") {
			assertNotNull(credCar1);
		}else {
			assertNull(credCar1);
		}
		assertEquals("1122334455",credCar1.getCardNumber());
	}

	@Test
	void testSetCardNumber() {
		credCar1.setCardNumber("02");
		assertEquals("02", credCar1.getCardNumber());
	}

	@Test
	void testGetCcv() {
		if(credCar1.getCcv() != "") {
			assertNotNull(credCar1);
		}else {
			assertNull(credCar1);
		}
	}

	@Test
	void testSetCcv() {
		credCar1.setCcv("112");
		assertEquals("112", credCar1.getCcv());

	}

	@Test
	void testGetDateOfExpiry() {
		if(credCar1.getDateOfExpiry() != "") {
			assertNotNull(credCar1);
		}else {
			assertNull(credCar1);
		}
	}

	@Test
	void testSetDateOfExpiry() {
		credCar1.setDateOfExpiry("00/00/1201");
		assertEquals("00/00/1201", credCar1.getDateOfExpiry());

	}*/

	@Test
	void testPay() {
		credCar1.pay(0);
		
		//assertEquals(credCar1.pay(0), 0);
	}

}
