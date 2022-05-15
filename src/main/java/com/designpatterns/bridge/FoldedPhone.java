package com.designpatterns.bridge;

/**
 * @author Jiahao Wang
 * @Description 抽象类的具体实现
 * @create 2022-05-14 22:37
 */
public class FoldedPhone extends Phone {

	public FoldedPhone(Brand brand) {
		super(brand);
	}

	// 里面实际是 Brand 接口的具体实现类 Apple 做事（super那个）
	protected void open() {
		super.open();
		System.out.println("folded phone open");
	}

	protected void text() {
		super.text();
		System.out.println("folded phone text");
	}

	protected void call() {
		super.call();
		System.out.println("folded phone call");
	}
}
