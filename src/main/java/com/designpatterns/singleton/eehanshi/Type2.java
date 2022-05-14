package com.designpatterns.singleton.eehanshi;

/**
 * @author Jiahao Wang
 * @Description 饿汉式 静态代码块
 * @create 2022-05-13 17:26
 */
public class Type2 {
	public static void main(String[] args) {
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Singleton2 {

	private Singleton2() {
	}

	private static Singleton2 instance;

	static {
		instance = new Singleton2();
	}

	public static Singleton2 getInstance() {
		return instance;
	}
}