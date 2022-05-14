package com.designpatterns.simplefactory.normalsimplefactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 22:48
 */
public class CoffeeStore {

	public Coffee orderCoffee(String type) {

		SimpleFactory simpleFactory = new SimpleFactory();
		//调用生产咖啡的方法
		Coffee coffee = simpleFactory.createCoffee(type);

		//加配料
		coffee.addMilk();
		coffee.addsugar();

		return coffee;
	}
}
