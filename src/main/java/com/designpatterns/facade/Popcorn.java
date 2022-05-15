package com.designpatterns.facade;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:07
 */
public class Popcorn {
	private static Popcorn instance = new Popcorn();

	public static Popcorn getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("Popcorn on");
	}

	public void off() {
		System.out.println("Popcorn off");
	}

	public void pop() {
		System.out.println("Popcorn pop");
	}
}
