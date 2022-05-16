package com.designpatterns.observer;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 00:24
 */
public class User1 implements Observer {
	private double temperature;
	private double pressure;
	private double humidity;

	@Override
	public void update(double temperature, double pressure, double humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
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
