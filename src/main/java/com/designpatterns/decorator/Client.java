package com.designpatterns.decorator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 01:13
 */
public class Client {
	public static void main(String[] args) {
		Drink order = new Decaf();

		order = new Milk(order);
		order = new Chocolate(order);

	}
}
