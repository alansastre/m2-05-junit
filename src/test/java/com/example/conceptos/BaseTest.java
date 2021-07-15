package com.example.conceptos;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

	/**
	 * Se ejecuta una vez solo al principio de todo
	 * @throws Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}
	/**
	 * Se ejecuta una vez solo al final del todo
	 * @throws Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}
}
