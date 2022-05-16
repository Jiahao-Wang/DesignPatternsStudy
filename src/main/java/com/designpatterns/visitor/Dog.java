package com.designpatterns.visitor;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:10
 */
public class Dog implements Animal {

	@Override
	public void accept(Person person) {
		person.feed(this);
		System.out.println("wang");
	}
}
