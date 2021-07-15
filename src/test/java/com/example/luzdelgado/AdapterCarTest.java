package com.example.luzdelgado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.structural.adapter.Car;

class AdapterCarTest {

	Car coche = new Car();

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
	@DisplayName("Test de aumento de velocidad sumando positivos")
	void testSpeedUpPositive() {
		double velActual = coche.getSpeed();
		coche.speedUp(5);
		assertEquals(velActual + 5, coche.getSpeed());
	}

	@Test
	@DisplayName("Test de aumento de velocidad con numeros negativos")
	void testSpeedUpNegative() {
		double velActual = coche.getSpeed();
		coche.speedUp(-3);
		assertEquals(velActual - 3, coche.getSpeed());
	}
	
	@Test
	@DisplayName(" ")
	void testSpeedUpZero() {
		double velActual = coche.getSpeed();
		coche.speedUp(0);
		assertEquals(0, velActual);
	}

//	@Test
//	void testGetSpeed() {
//¿cómo hago un test que me delvuelva el valor que extraigo sea el correcto? - cómo se testea un getter
//	}

	@Test
	@DisplayName("Test para probar setSpeed")
	void testSetSpeed() {
		coche.setSpeed(5);
		assertEquals(5, coche.getSpeed());

	}

}
