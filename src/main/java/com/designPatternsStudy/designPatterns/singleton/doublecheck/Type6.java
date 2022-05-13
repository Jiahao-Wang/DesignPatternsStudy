package com.designPatternsStudy.designPatterns.singleton.doublecheck;

/**
 * @author Jiahao Wang
 * @Description 双重检查 建议使用！
 * @create 2022-05-13 17:55
 */
public class Type6 {
	public static void main(String[] args) {
		Singleton6 s1 = Singleton6.getInstance();
		Singleton6 s2 = Singleton6.getInstance();

		System.out.println(s1 == s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}

class Singleton6 {
	// volatile：如果有修改，会立即刷新到内存中
	private static volatile Singleton6 instance;

	private Singleton6() {
	}

	public static Singleton6 getInstance() {
		if (instance == null) {
			synchronized (Singleton6.class) {
				if (instance == null) {
					instance = new Singleton6();
				}
			}
		}
		return instance;
	}
}