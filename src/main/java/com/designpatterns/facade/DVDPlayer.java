package com.designpatterns.facade;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:06
 */
public class DVDPlayer {
	private static DVDPlayer instance = new DVDPlayer();

	public static DVDPlayer getInstance() {
		return instance;
	}

	public void on() {
		System.out.println("DVD on");
	}

	public void off() {
		System.out.println("DVD off");
	}

	public void play() {
		System.out.println("DVD play");
	}
}
