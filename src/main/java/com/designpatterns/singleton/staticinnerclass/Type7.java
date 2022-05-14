package com.designpatterns.singleton.staticinnerclass;

/**
 * @author Jiahao Wang
 * @Description 静态内部类 推荐使用！
 * @create 2022-05-13 18:07
 */
public class Type7 {
	public static void main(String[] args) {
		Singleton7 s1 = Singleton7.getInstance();
		Singleton7 s2 = Singleton7.getInstance();

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Singleton7 {
	private static Singleton7 instance;

	private Singleton7() {
	}

	// 静态内部类，有一个静态属性 Singleton
	private static class SingletonInstance {
		private static final Singleton7 INSTANCE = new Singleton7();
	}

	public static Singleton7 getInstance() {
		return SingletonInstance.INSTANCE;
	}
}