package com.designpatterns.decorator;

/**
 * @author Jiahao Wang
 * @Description 装饰者的具体实现类2
 * @create 2022-05-15 01:06
 */
public class Chocolate extends Decorator {
	public Chocolate(Drink drink) {
		super(drink);
		setDescription("add a chocolate");
		setPrice(3);
	}
}
