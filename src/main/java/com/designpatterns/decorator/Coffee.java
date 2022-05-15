package com.designpatterns.decorator;

/**
 * @author Jiahao Wang
 * @Description 继承自基类（Coffee 是 Drink 的一种）
 * @create 2022-05-15 01:05
 */
public class Coffee extends Drink {
	@Override
	public int cost() {
		return super.getPrice();
	}
}
