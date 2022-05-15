package com.designpatterns.facade;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:03
 */
public class Client {
	public static void main(String[] args) {
		TheaterFacade theaterFacade = new TheaterFacade();

		theaterFacade.ready();
		theaterFacade.play();
		theaterFacade.end();
	}
}
