package com.designpatterns.visitor;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:09
 */
public class Cat implements Animal {
	@Override
	public void accept(Person person) {
		person.feed(this);

		System.out.println("miao");
	}
}
