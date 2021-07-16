package com.example.bea;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.observer.Computer;
import com.example.demo.patterns.behavioral.observer.SmartPhone;
import com.example.demo.patterns.behavioral.observer.WeatherType;

class SmartPhoneTest {

	
	SmartPhone smartPhone = new SmartPhone();
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
	@DisplayName("Comprobar notificacion al SmartPhone es CLOUDY")
	void testSmartPhoneCLOUDY() {
		
		WeatherType type = WeatherType.CLOUDY;
		smartPhone.update(type);
		assertTrue(type instanceof WeatherType);
		
	}
	
	@Test
	@DisplayName("Comprobar notificacion al SmartPhone es SUNNY")
	void testSmartPhoneSUNNY() {
		
		WeatherType type = WeatherType.SUNNY;
		smartPhone.update(type);
		assertTrue(type instanceof WeatherType);
		
	}
	
	@Test
	@DisplayName("Comprobar notificacion al SmartPhone es RAINY")
	void testSmartPhoneRAINY() {
		
		WeatherType type = WeatherType.RAINY;
		smartPhone.update(type);
		assertTrue(type instanceof WeatherType);
		
	}

}
