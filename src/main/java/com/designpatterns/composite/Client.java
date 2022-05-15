package com.designpatterns.composite;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 12:24
 */
public class Client {
	public static void main(String[] args) {

		// 从大到小创建对象
		OrganizationComponent university = new University("uOttawa", "牛逼");

		OrganizationComponent department1 = new Department("Art", "人文艺术学院");
		OrganizationComponent department2 = new Department("Engineering", "工程学院");

		university.add(department1);
		university.add(department2);

		department1.add(new Faculty("Painting", "绘画"));
		department2.add(new Faculty("CSI", "Computer Science"));
		department2.add(new Faculty("GNG", "Engineering Faculty"));
		department2.add(new Faculty("ABC", "..."));

		university.print();

	}
}
