package com.designpatterns.adapter.objectadapter;

/**
 * @author Jiahao Wang
 * @Description 被适配的类 src，需要被继承
 * @create 2022-05-14 19:52
 */
public class Voltage220V {

	public int output220V() {
		System.out.println("output 220V");
		return 220;
	}
}
