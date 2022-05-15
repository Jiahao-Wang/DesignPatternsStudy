package com.designpatterns.bridge;

/**
 * @author Jiahao Wang
 * @Description 这其实是个桥，连接了 Brand 品牌 和 Folded 类型
 * @create 2022-05-14 22:35
 */
public abstract class Phone {
	private Brand brand;

	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}

	protected void open() {
		this.brand.open();
	}

	protected void text() {
		this.brand.text();
	}

	protected void call() {
		this.brand.call();
	}

}
