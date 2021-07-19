package com.example.demo.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone implements WeatherObserver{
	
	List<String> notifications = new ArrayList<>();
    @Override
    public void update(WeatherType type) {
        System.out.println("Smartphone has been notified of weather change: " + type);
        notifications.add("Smartphone has been notified of weather change: " + type);
        
    }
}
