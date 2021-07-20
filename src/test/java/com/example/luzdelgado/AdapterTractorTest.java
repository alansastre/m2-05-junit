package com.example.luzdelgado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.structural.adapter.Tractor;

class AdapterTractorTest {
	
	Tractor tractor;


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
		tractor = new Tractor(); // esto inicializa el tractor nuevo para cada test
		System.out.println("setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	@DisplayName("Test para probar setSpeed")
	void testSetSpeed() {
		tractor.setSpeed(3);
		assertEquals(3, tractor.getSpeed());

	}

	@Test
	@DisplayName("Test que confirma el cambio a modo 1 de velocidad")
	void testChangeModeVel1() {
		tractor.changeMode(1);
		assertEquals(5, tractor.getSpeed());	
	}
	
	@Test
	@DisplayName("Test que confirma el cambio a modo 2 de velocidad")
	void testChangeModeVel2() {
		tractor.changeMode(2);
		assertEquals(15, tractor.getSpeed());	
	}
	

	@Test
	@DisplayName("Test que confirma modo default")
	void testChangeModeDefaultCase() {
		tractor.changeMode(3);
		assertEquals(0.0, tractor.getSpeed());	
	}
}
