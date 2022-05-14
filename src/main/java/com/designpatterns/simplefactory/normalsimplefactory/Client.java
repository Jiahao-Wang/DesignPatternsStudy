package com.designpatterns.simplefactory.normalsimplefactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 22:48
 */
public class Client {
	public static void main(String[] args) {
		//创建咖啡店类对象
		CoffeeStore store = new CoffeeStore();
		Coffee coffee = store.orderCoffee("american");

		System.out.println(coffee.getName());
	}
}
