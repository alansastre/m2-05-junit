package com.example.bea;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.observer.Computer;
import com.example.demo.patterns.behavioral.observer.SmartPhone;
import com.example.demo.patterns.behavioral.observer.Weather;
import com.example.demo.patterns.behavioral.observer.WeatherType;

class WeatherTest {
	
	Weather weather  = new Weather();
	Computer computer = new Computer();
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
	void testChangeWeatherRainy() {
		SmartPhone smart = new SmartPhone();
		weather.changeWeather(WeatherType.RAINY);
		assertEquals(WeatherType.RAINY,weather.getCurrentWeather());
		
	}


	@Test
	@DisplayName("verificamos el cambio de tiempo a CLOUDY")
	void testChangeWeatherCloudy() {
		SmartPhone smart = new SmartPhone();
		weather.changeWeather(WeatherType.CLOUDY);
		assertEquals(WeatherType.CLOUDY,weather.getCurrentWeather());
		
	}
	
	
	@Test
	@DisplayName("verificamos el cambio de tiempo a SUNNY")
	void testChangeWeatherSunny() {
		SmartPhone smart = new SmartPhone();
		weather.changeWeather(WeatherType.SUNNY);
		assertEquals(WeatherType.SUNNY,weather.getCurrentWeather());
		
	}
	
	@Test
	@DisplayName("Verificamos notificacion RAINY a los observadores SmartPhone")
	void testNotifyObserversSmartPhoneRainy() {
		SmartPhone smart = new SmartPhone();
		List<String> notificationsSmartPhone = new ArrayList();
		weather.changeWeather(WeatherType.RAINY);
		weather.addObserver(smart);		
		smart.getNotificationsSmartPhone();
		assertEquals(0,smart.getNotificationsSmartPhone().size());
		weather.notifyObservers();
		assertEquals(1,smart.getNotificationsSmartPhone().size());
		notificationsSmartPhone = smart.getNotificationsSmartPhone();
		assertEquals("Smartphone has been notified of weather change: RAINY",notificationsSmartPhone.get(0));
	}
	@Test
	@DisplayName("verificamos notificacion RAINY a los observadores Computer")
	void testNotifyObserversComputerRainy() {
		Computer computer = new Computer();
		List<String> notificationsComputer = new ArrayList();
		weather.changeWeather(WeatherType.RAINY);
		weather.addObserver(computer);				
		computer.getNotificationsComputer();
		assertEquals(0,computer.getNotificationsComputer().size());
		weather.notifyObservers();
		assertEquals(1,computer.getNotificationsComputer().size());
		notificationsComputer = computer.getNotificationsComputer();
		assertEquals("Computer has been notified of weather change: RAINY",notificationsComputer.get(0));
		
	}
	
	@Test
	@DisplayName("verificamos notificacion CLOUDY a los observadores SmartPhone ")
	void testNotifyObserversSmartPhoneCloudy() {
		SmartPhone smart = new SmartPhone();
		List<String> notificationsSmartPhone = new ArrayList();
		weather.changeWeather(WeatherType.CLOUDY);
		weather.addObserver(smart);		
		smart.getNotificationsSmartPhone();
		assertEquals(0,smart.getNotificationsSmartPhone().size());
		weather.notifyObservers();
		assertEquals(1,smart.getNotificationsSmartPhone().size());
		notificationsSmartPhone = smart.getNotificationsSmartPhone();
		
		assertEquals("Smartphone has been notified of weather change: CLOUDY",notificationsSmartPhone.get(0));
	}
	
	@Test
	@DisplayName("verificamos notificacion CLOUDY a los observadores Computer")
	void testNotifyObserversComputerCloudy() {
		Computer computer = new Computer();
		List<String> notificationsComputer = new ArrayList();
		weather.changeWeather(WeatherType.CLOUDY);
		weather.addObserver(computer);
		computer.getNotificationsComputer();
		assertEquals(0,computer.getNotificationsComputer().size());
		weather.notifyObservers();
		assertEquals(1,computer.getNotificationsComputer().size());
		notificationsComputer = computer.getNotificationsComputer();
		assertEquals("Computer has been notified of weather change: CLOUDY",notificationsComputer.get(0));
		
	}
	
	@Test
	@DisplayName("verificamos notificacion SUNNY a los observadores SmartPhone")
	void testNotifyObserversSmartPhoneSunny() {
		SmartPhone smart = new SmartPhone();
		List<String> notificationsSmartPhone = new ArrayList();
		weather.changeWeather(WeatherType.SUNNY);
		weather.addObserver(smart);		
		smart.getNotificationsSmartPhone();
		assertEquals(0,smart.getNotificationsSmartPhone().size());
		weather.notifyObservers();
		assertEquals(1,smart.getNotificationsSmartPhone().size());
		notificationsSmartPhone = smart.getNotificationsSmartPhone();
		assertEquals("Smartphone has been notified of weather change: SUNNY",notificationsSmartPhone.get(0));
	}
	
	@Test
	@DisplayName("verificamos notificacion SUNNY a los observadores Computer")
	void testNotifyObserversComputerSunny() {
		Computer computer = new Computer();
		List<String> notificationsComputer = new ArrayList();
		weather.changeWeather(WeatherType.SUNNY);
		weather.addObserver(computer);
		computer.getNotificationsComputer();
		assertEquals(0,computer.getNotificationsComputer().size());
		weather.notifyObservers();
		assertEquals(1,computer.getNotificationsComputer().size());
		notificationsComputer = computer.getNotificationsComputer();
		assertEquals("Computer has been notified of weather change: SUNNY",notificationsComputer.get(0));
		
	}
	
}
	
