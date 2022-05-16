package com.designpatterns.observer;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 00:10
 */
public class CurrentConditions implements Observer {

	private double temperature;
	private double pressure;
	private double humidity;

	public void update(double temperature, double pressure, double humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("CurrentConditions{" +
				"temperature=" + temperature +
				", pressure=" + pressure +
				", humidity=" + humidity +
				'}');
	}


}
