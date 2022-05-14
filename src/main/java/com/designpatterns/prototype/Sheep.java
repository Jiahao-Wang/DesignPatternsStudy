package com.designpatterns.prototype;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 11:36
 */
public class Sheep implements Cloneable {

	private String name;
	private int age;

	public Sheep() {
	}

	public Sheep(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public String toString() {
//		return "Sheep{" +
//				"name='" + name + '\'' +
//				", age=" + age +
//				'}';
//	}

	@Override
	protected Object clone() {
		Sheep sheep = null;

		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheep;

	}

	// 深拷贝代码：
}
