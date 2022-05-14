package com.designpatterns.singleton.eehanshi;

/**
 * @author Jiahao Wang
 * @Description 饿汉式 静态常量
 * @create 2022-05-13 17:16
 */
public class Type1 {
	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Singleton1 {

	private Singleton1() {
	}

	private final static Singleton1 instance = new Singleton1();

	public static Singleton1 getInstance() {
		return instance;
	}
}
