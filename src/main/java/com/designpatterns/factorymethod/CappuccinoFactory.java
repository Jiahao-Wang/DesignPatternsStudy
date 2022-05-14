package com.designpatterns.factorymethod;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 23:13
 */
public class CappuccinoFactory implements CoffeeFactory {

	@Override
	public Coffee createCoffee() {
		return new Cappuccino();
	}
}
