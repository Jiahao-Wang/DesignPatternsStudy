package com.designpatterns.singleton.enumsingleton.lanhanshi;

/**
 * @author Jiahao Wang
 * @Description 懒汉式 线程安全 同步代码块 （此方法错误，请勿使用！！）
 * @create 2022-05-13 17:36
 */
public class Type5 {
	public static void main(String[] args) {
		Singleton5 s1 = Singleton5.getInstance();
		Singleton5 s2 = Singleton5.getInstance();

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Singleton5 {
	private static Singleton5 instance;

	private Singleton5() {
	}

	// 无法保证线程安全。请勿使用！
	public static Singleton5 getInstance() {
		if (instance == null) {
			synchronized (Singleton5.class) {
				instance = new Singleton5();
			}
		}
		return instance;
	}
}