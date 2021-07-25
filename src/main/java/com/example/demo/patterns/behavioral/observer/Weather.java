<<<<<<< HEAD
package com.example.demo.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
 
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather(){
        this.observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver obs){
        System.out.println("A�adido obs");
        this.observers.add(obs);
    }

    public void removeObserver(WeatherObserver obs){
        System.out.println("A�adido obs");
        this.observers.remove(obs);
    }

    // cambio de tiempo
    public void changeWeather(WeatherType currentWeather){
        this.currentWeather = currentWeather;
        this.notifyObservers();
    }

    // notificar del cambio de tiempo
    private void notifyObservers(){
        for (WeatherObserver observer: this.observers) {
            observer.update(this.currentWeather);
        }
    }

	public WeatherType getCurrentWeather() {
		return currentWeather;
	}

	public List<WeatherObserver> getObservers() {
		return observers;
	}

	public void setCurrentWeather(WeatherType currentWeather) {
		this.currentWeather = currentWeather;
	}

	public void setObservers(List<WeatherObserver> observers) {
		this.observers = observers;
	}
}
=======
package com.example.demo.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
 
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather(){
        this.observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver obs){
        System.out.println("A�adido obs");
        this.observers.add(obs);
    }

    public void removeObserver(WeatherObserver obs){
        System.out.println("A�adido obs");
        this.observers.remove(obs);
    }

    // cambio de tiempo
    public void changeWeather(WeatherType currentWeather){
        this.currentWeather = currentWeather;
        this.notifyObservers();
    }

    // notificar del cambio de tiempo
    public void notifyObservers(){
        for (WeatherObserver observer: this.observers) {
            observer.update(this.currentWeather);
        }
    }

	public WeatherType getCurrentWeather() {
		return currentWeather;
	}

	public List<WeatherObserver> getObservers() {
		return observers;
	}

	public void setCurrentWeather(WeatherType currentWeather) {
		this.currentWeather = currentWeather;
	}

	public void setObservers(List<WeatherObserver> observers) {
		this.observers = observers;
	}
    
    
}
>>>>>>> refs/heads/feature/bea
