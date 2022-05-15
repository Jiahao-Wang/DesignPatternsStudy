package com.designpatterns.decorator;

/**
 * @author Jiahao Wang
 * @Description 装饰者其实也是基类的一种（Milk 也是 Drink 的一种）
 * @create 2022-05-15 01:06
 */
public class Decorator extends Drink {
	private Drink d;

	public Decorator(Drink d) {
		this.d = d;
	}

	// 叠加价格
	@Override
	public int cost() {
		return super.getPrice() + d.cost();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " + " + d.getPrice();
	}
}
