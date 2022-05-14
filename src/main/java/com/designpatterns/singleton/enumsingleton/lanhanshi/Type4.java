package com.designpatterns.singleton.enumsingleton.lanhanshi;

/**
 * @author Jiahao Wang
 * @Description 懒汉式 线程安全
 * @create 2022-05-13 17:36
 */
public class Type4 {
	public static void main(String[] args) {
		Singleton4 s1 = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Singleton4 {
	private static Singleton4 instance;

	private Singleton4() {
	}

	public static synchronized Singleton4 getInstance() {
		if (instance == null) {
			instance = new Singleton4();
		}
		return instance;
	}
}