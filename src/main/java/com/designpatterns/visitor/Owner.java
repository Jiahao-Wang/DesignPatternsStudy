package com.designpatterns.visitor;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:10
 */
public class Owner implements Person {

	@Override
	public void feed(Cat cat) {
		System.out.println("owner feed cat");
	}

	@Override
	public void feed(Dog dog) {
		System.out.println("owner feed dog");
	}
}
