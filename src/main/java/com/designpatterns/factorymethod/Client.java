package com.designpatterns.factorymethod;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 23:10
 */
public class Client {
	public static void main(String[] args) {
		CoffeeStore store = new CoffeeStore();

		CoffeeFactory factory = new AmericanCoffeeFactory();
		store.setFactory(factory);
		Coffee coffee = store.orderCoffee();
		System.out.println(coffee.getName());


		CoffeeFactory factory1 = new CappuccinoFactory();
		store.setFactory(factory1);
		Coffee coffee1 = store.orderCoffee();
		System.out.println(coffee1.getName());

	}
}
