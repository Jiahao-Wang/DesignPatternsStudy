package com.designpatterns.prototype;

/**
 * @author Jiahao Wang
 * @Description 原型模式
 * @create 2022-05-14 11:38
 */
public class Client {
	public static void main(String[] args) {
		Sheep sheep = new Sheep("Dolly", 5);
		Sheep sheep1 = (Sheep) sheep.clone();
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();

		System.out.println(sheep);
		System.out.println(sheep1);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
	}


}
