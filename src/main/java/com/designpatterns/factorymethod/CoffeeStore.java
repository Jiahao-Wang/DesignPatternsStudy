package com.designpatterns.factorymethod;

import com.designpatterns.simplefactory.normalsimplefactory.SimpleFactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 22:48
 */
public class CoffeeStore {


	private CoffeeFactory factory;

	public void setFactory(CoffeeFactory factory) {
		this.factory = factory;
	}

	public Coffee orderCoffee() {
		return factory.createCoffee();
	}
}
