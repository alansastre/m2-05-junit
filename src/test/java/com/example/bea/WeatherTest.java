package com.example.bea;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.observer.SmartPhone;
import com.example.demo.patterns.behavioral.observer.Weather;
import com.example.demo.patterns.behavioral.observer.WeatherType;

class WeatherTest {

	Weather weather  = new Weather();
	
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
	@DisplayName("verificamos que los observadores estan vacios")
	void testaddObserverEmpty() {
		int size = weather.getObservers().size();
		assertEquals(0,size);
		//weather.addObserver();
	}
	
	@Test
	@DisplayName("verificamos que los observadores aumentan al añadir")
	void testaddObserver() {
		SmartPhone smart = new SmartPhone();
		weather.addObserver(smart);
		int size = weather.getObservers().size();
		assertEquals(1,size);

	}
	
	@Test
	@DisplayName("verificamos que los observadores disminuye al añadir")
	void testRemoveObserver() {
		SmartPhone smart = new SmartPhone();
		weather.addObserver(smart);
		int size = weather.getObservers().size();
		assertEquals(1,size);
		weather.removeObserver(smart);
		size = weather.getObservers().size();
		assertEquals(0,size);

	}
	
	@Test
	@DisplayName("verificamos el cambio de tiempo a RAINY")
	void testChangeWeather() {
		SmartPhone smart = new SmartPhone();
		WeatherType currentWeather = WeatherType.RAINY;
		weather.changeWeather(currentWeather);
		assertEquals("RAINY",currentWeather);
	
		
	}
	
	@Test
	@DisplayName("verificamos notificacion a los observadores")
	void testnotifyObservers() {
		
	}
	
	
	
	

}
