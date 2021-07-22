package com.example.marinamadrid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.patterns.structural.adapter.TractorAdapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdapterTractorTest {
	
	TractorAdapter tractorAdapter;

	@BeforeEach
	void setUp() throws Exception {
		tractorAdapter = new TractorAdapter();
	}

	@Test
	@DisplayName("Velocidad<15 -> modo1")
	void less15SpeedUpTest() {
		tractorAdapter.speedUp(10);
		assertEquals(5, tractorAdapter.getSpeed());
	}
	
	@Test
	@DisplayName("Velocidad>15 -> modo2")
	void equalMore15SpeedUpTest() {
		tractorAdapter.speedUp(20);
		assertEquals(15, tractorAdapter.getSpeed());
	}
	
	@Test
	@DisplayName("Comprobar getSpeed")
	void getSpeedTest() {
		double temp = tractorAdapter.getSpeed();
		assertEquals(temp, tractorAdapter.getSpeed());
	}

}
