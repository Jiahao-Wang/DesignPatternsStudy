package com.designpatterns.observer;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 00:08
 */
public interface Observer {

	public void update(double temperature, double pressure, double humidity);
}
