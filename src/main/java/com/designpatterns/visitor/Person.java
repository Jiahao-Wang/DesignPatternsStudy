package com.designpatterns.visitor;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:07
 */
public interface Person {

	void feed(Cat cat);

	void feed(Dog dog);
}
