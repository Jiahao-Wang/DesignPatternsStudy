package com.designpatterns.visitor;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:11
 */
public class Others implements Person {
	@Override
	public void feed(Dog dog) {
		System.out.println("others feed dog");
	}

	@Override
	public void feed(Cat cat) {
		System.out.println("others feed cat");
	}
}
