package com.designpatterns.bridge;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 22:49
 */
public class Client {

	public static void main(String[] args) {
		Phone phone = new FoldedPhone(new Apple());

		phone.open();
		phone.call();
		phone.text();
	}
}
