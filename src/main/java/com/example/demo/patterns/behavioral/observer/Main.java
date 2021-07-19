package com.example.demo.patterns.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		
		// preparando
		SmartPhone smart = new SmartPhone();
		
		// ejecutando comportamiento a testear
		Weather weather = new Weather();
		weather.addObserver(smart);
		weather.changeWeather(WeatherType.CLOUDY);
		
		// assert
//		smart.get notifications 
//		equals Smartphone has been notified of weather change: " + type
	}
}
