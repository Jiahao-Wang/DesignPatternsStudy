package com.designpatterns.observer;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 00:19
 */
public class Client {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditions currentConditions = new CurrentConditions();

		User1 user1 = new User1();

		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(user1);

		weatherData.setData(10, 100, 120);

		weatherData.removeObserver(currentConditions);

		weatherData.setData(20, 30, 40);
	}
}
