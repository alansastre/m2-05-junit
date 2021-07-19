package com.example.demo.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Computer implements WeatherObserver{
	
	private List<String> notificationsComputer = new ArrayList();
    @Override
    public void update(WeatherType type) {
        System.out.println("Computer has been notified of weather change: " + type);
        notificationsComputer.add("Smartphone has been notified of weather change: " + type);
    }
	public List<String> getNotificationsComputer() {
		return notificationsComputer;
	}
	public void setNotificationsComputer(List<String> notificationsComputer) {
		this.notificationsComputer = notificationsComputer;
	}
    
    
}
