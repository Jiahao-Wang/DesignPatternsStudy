package com.designpatterns.builder.onemorething;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 18:59
 */
public class Client {
	public static void main(String[] args) {
		Phone phone = new Phone.Builder()
				.cpu("cpu")
				.motherboard("motherboard")
				.memory("memory")
				.screen("screen")
				.build();

		System.out.println(phone);
	}
}
