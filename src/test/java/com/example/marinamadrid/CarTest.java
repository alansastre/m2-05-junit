package com.example.marinamadrid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.structural.adapter.Car;


class CarTest {
	Car car;
	
	@BeforeEach
	void setUp() throws Exception {
		car = new Car();
	}
	
	@Test
	@DisplayName("Velocidad cero")
	void ZeroSpeedUpTest() {
		double currentSpeed = car.getSpeed();
		car.speedUp(0);
		assertEquals(0, currentSpeed);
	}
	
	@Test
	@DisplayName("Incremento de velocidad con positivos")
	void PositiveSpeedUpTest() {
		double currentSpeed = car.getSpeed();
		car.speedUp(60);
		double newSpeed = car.getSpeed();
		assertEquals(currentSpeed + 60, newSpeed);
	}
	
	@Test
	@DisplayName("Disminución de velocidad con negativos")
	void NegativeSpeedUpTest() {
		double currentSpeed = car.getSpeed();
		car.speedUp(-20);
		double newSpeed = car.getSpeed();
		assertEquals(currentSpeed -20, newSpeed);
	}
	
	@Test
	@DisplayName("Prueba setSpeed")
	void setSpeedTest() {
		car.setSpeed(20);
		double newSpeed = car.getSpeed();
		assertEquals(20, newSpeed);
	}
}
