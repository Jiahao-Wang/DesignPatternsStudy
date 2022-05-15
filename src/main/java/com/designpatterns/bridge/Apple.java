package com.designpatterns.bridge;

/**
 * @author Jiahao Wang
 * @Description 具体实现了接口里的方法
 * @create 2022-05-14 21:36
 */
public class Apple implements Brand {
	@Override
	public void open() {
		System.out.println("Apple open");
	}

	@Override
	public void text() {
		System.out.println("Apple text");
	}

	@Override
	public void call() {
		System.out.println("Apple call");
	}
}
