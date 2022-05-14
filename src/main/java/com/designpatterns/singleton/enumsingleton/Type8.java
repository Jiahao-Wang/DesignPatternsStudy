package com.designpatterns.singleton.enumsingleton;

/**
 * @author Jiahao Wang
 * @Description 单例模式 枚举方式
 * @create 2022-05-13 18:17
 */
public class Type8 {
	public static void main(String[] args) {
		Singleton8 s1 = Singleton8.INSTANCE;
		Singleton8 s2 = Singleton8.INSTANCE;

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		// 也可以调用里面的方法
		s1.sayOK();
	}
}

enum Singleton8 {
	INSTANCE;

	public void sayOK() {
		System.out.println("ok");
	}
}