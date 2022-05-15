package com.designpatterns.adapter.classadapter;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 19:57
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("类适配器模式：");
		Phone phone = new Phone();
		phone.Charge(new VoltageAdapter());
	}
}
