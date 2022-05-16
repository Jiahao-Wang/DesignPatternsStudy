package com.designpatterns.visitor;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:13
 */
public class Client {
	public static void main(String[] args) {

		Home home = new Home();

		home.add(new Cat());
		home.add(new Dog());

		Owner owner = new Owner();
		home.action(owner);

		Others others = new Others();
		home.action(others);
	}
}
