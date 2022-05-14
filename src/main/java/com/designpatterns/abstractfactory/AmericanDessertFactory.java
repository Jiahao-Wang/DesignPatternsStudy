package com.designpatterns.abstractfactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 23:56
 */
public class AmericanDessertFactory implements DessertFactory {
	@Override
	public Coffee createCoffee() {
		return new AmericanCoffee();
	}

	@Override
	public Dessert createDessert() {
		return new Mousse();
	}
}
