package com.example.demo.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone implements WeatherObserver{
	
	List<String> notificationsSmartPhone = new ArrayList();
	
    @Override
    public void update(WeatherType type) {
        System.out.println("Smartphone has been notified of weather change: " + type);
        notificationsSmartPhone.add("Smartphone has been notified of weather change: " + type);
    }
}
