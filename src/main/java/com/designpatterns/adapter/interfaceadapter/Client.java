package com.designpatterns.adapter.interfaceadapter;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 20:29
 */
public class Client {
	public static void main(String[] args) {
		AbstractAdapter adapter = new AbstractAdapter() {
			@Override
			public void m1() {
				super.m1();
				System.out.println("m1");
			}
		};
		adapter.m1();
	}
}
