package com.designpatterns.facade;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:08
 */
public class Projector {
	private static Projector instance = new Projector();

	public static Projector getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("Projector on");
	}

	public void off() {
		System.out.println("Projector off");
	}

	public void focus() {
		System.out.println("Projector focus");
	}
}
