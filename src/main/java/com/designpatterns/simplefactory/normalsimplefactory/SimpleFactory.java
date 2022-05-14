package com.designpatterns.simplefactory.normalsimplefactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 22:48
 */
public class SimpleFactory {
	public Coffee createCoffee(String type) {
		//声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
		Coffee coffee = null;
		if ("american".equals(type)) {
			coffee = new AmericanCoffee();
		} else if ("latte".equals(type)) {
			coffee = new LatteCoffee();
		} else {
			throw new RuntimeException("对不起，您所点的咖啡没有");
		}

		return coffee;
	}
}
