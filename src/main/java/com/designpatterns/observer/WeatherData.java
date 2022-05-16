package com.designpatterns.observer;

import java.util.ArrayList;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 00:14
 */
public class WeatherData implements Subject {
	private double temperature;
	private double pressure;
	private double humidity;

	private ArrayList<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(this.temperature, this.pressure, this.humidity);
		}
	}

	public double getTemperature() {
		return temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setData(double temperature, double pressure, double humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}

	public void dataChange() {
		notifyObservers();
	}

}
