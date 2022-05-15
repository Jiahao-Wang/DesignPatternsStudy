package com.designpatterns.decorator;

/**
 * @author Jiahao Wang
 * @Description 抽象基类，本体和装饰者都要继承它
 * @create 2022-05-15 01:04
 */
public abstract class Drink {
	private String description;
	private int price;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract int cost();
}
