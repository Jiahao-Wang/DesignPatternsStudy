package com.designpatterns.Responsibility;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 14:04
 */
public class Request {
	private int type;
	private int price;
	private int id;

	public Request(int type, int price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}
}
