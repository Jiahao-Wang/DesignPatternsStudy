package com.designPatternsStudy.designPatterns.singleton.lanhanshi;

/**
 * @author Jiahao Wang
 * @Description 懒汉式 线程不安全
 * @create 2022-05-13 17:36
 */
public class Type3 {
	public static void main(String[] args) {
		Singleton3 s1 = Singleton3.getInstance();
		Singleton3 s2 = Singleton3.getInstance();

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Singleton3 {
	private static Singleton3 instance;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}
