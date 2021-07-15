package com.example.luzdelgado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.structural.adapter.Tractor;

class AdapterTractorTest {
	
	Tractor tractor = new Tractor();


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

//	@Test
//	void testGetSpeed() {
//¿cómo hago un test que me delvuelva el valor que extraigo sea el correcto? - cómo se testea un getter
//	}

	@Test
	void testSetSpeed() {
		fail("Not yet implemented");
	}

	@Test
	void testChangeMode() {
		fail("Not yet implemented");
	}

}
