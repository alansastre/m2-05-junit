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
import com.example.demo.patterns.behavioral.observer.WeatherType;


class ComputerTest {
    
	Computer computer = new Computer();
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
	@DisplayName("Comprobar el nombre del tiempo es correcto")
	void testTipoTiempoCLOUDY() {
		
		WeatherType type = WeatherType.CLOUDY;
		computer.update(type);
		assertTrue(type instanceof WeatherType);
		
	}
	
	@Test
	@DisplayName("Comprobar el nombre del tiempo es correcto")
	void testTipoTiempoSUNNY() {
		
		WeatherType type = WeatherType.SUNNY;
		computer.update(type);
		assertTrue(type instanceof WeatherType);
		
	}
	
	@Test
	@DisplayName("Comprobar el nombre del tiempo es correcto")
	void testTipoTiempoRAINY() {
		
		WeatherType type = WeatherType.RAINY;
		computer.update(type);
		assertTrue(type instanceof WeatherType);
		
	}
	
}	
	
	
