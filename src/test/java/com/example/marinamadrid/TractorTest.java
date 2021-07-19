package com.example.marinamadrid;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import com.example.demo.patterns.structural.adapter.Tractor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TractorTest {
	
	Tractor tractor;
	
	@BeforeEach
	void setUp() throws Exception {
		tractor = new Tractor();
	}

	@Test
	@DisplayName("Cambio del primer modo")
	void FirstModeTest() {
		tractor.changeMode(1);
		assertEquals(5, tractor.getSpeed());
		}

	@Test
	@DisplayName("Cambio del segundo modo")
	void SecondModeTest() {
		tractor.changeMode(2);
		assertEquals(15, tractor.getSpeed());
		}
	
	@Test
	@DisplayName("Cambio del segundo modo")
	void DefaultModeTest() {
		double currentSpeed = tractor.getSpeed();
		tractor.changeMode(3);
		assertEquals(tractor.getSpeed(), currentSpeed);
		}
	
	@Test
	@DisplayName("Prueba setSpeed")
	void setSpeedTest() {
		tractor.setSpeed(20);
		double newSpeed = tractor.getSpeed();
		assertEquals(20, newSpeed);
	}

	
}
	
	

