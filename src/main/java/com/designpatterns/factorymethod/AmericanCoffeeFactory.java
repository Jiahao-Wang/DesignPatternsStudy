package com.designpatterns.factorymethod;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 23:06
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new AmericanCoffee();
	}
}
