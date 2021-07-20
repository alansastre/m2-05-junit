package com.example.luzdelgado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.structural.adapter.TractorAdapter;

class AdapterTractorAdapterTest {

	TractorAdapter tractorAdapter = new TractorAdapter();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");

	}

	@Test
	@DisplayName("La velocidad es menor a 15 se cambia a velocidad 1")
	void testSpeedUpLessThan15() {
		tractorAdapter.speedUp(10);
		assertEquals(5, tractorAdapter.getSpeed());
	}


	@Test
	@DisplayName("La velocidad es mayor a 15 se cambia a velocidad 2")
	void testSpeedUpGreaterThan15() {
		tractorAdapter.speedUp(21);
		assertEquals(15, tractorAdapter.getSpeed());

	}
}
