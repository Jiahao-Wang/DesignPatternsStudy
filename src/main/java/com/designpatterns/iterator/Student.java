package com.designpatterns.iterator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:58
 */
public class Student {

	private String name;
	private String desc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Student(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Department{" +
				"name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}
