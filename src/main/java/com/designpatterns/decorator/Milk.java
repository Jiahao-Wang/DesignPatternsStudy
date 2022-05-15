package com.designpatterns.decorator;

/**
 * @author Jiahao Wang
 * @Description 装饰者的具体实现类1
 * @create 2022-05-15 01:06
 */
public class Milk extends Decorator {
	public Milk(Drink drink) {
		super(drink);
		setDescription("add a milk");
		setPrice(2);
	}
}
