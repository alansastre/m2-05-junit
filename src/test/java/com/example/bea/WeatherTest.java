package com.example.bea;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.observer.Weather;

class WeatherTest {

	Weather weather  = new Weather();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		Weather.
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
		weather.getObservers().size();
		assertEquals(0,0);
		//weather.addObserver();
	}
	
	@Test
	void testRemoveObserver() {
		

	}
	
	
	
	

}
