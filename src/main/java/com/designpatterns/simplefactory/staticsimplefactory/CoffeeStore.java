package com.designpatterns.simplefactory.staticsimplefactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 22:48
 */
public class CoffeeStore {

	public Coffee orderCoffee(String type) {


		// 调用生产咖啡的方法
		// 因为变成 static，直接用类名调用即可
		Coffee coffee = SimpleFactory.createCoffee(type);

		//加配料
		coffee.addMilk();
		coffee.addsugar();

		return coffee;
	}
}
