package com.designpatterns.abstractfactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 23:57
 */
public class ItalianDessertFactory implements DessertFactory {
	@Override
	public Dessert createDessert() {
		return new Tiramisu();
	}

	@Override
	public Coffee createCoffee() {
		return new LatteCoffee();
	}
}
