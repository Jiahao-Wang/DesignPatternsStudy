package com.designpatterns.visitor;

import java.util.ArrayList;

/**
 * @author Jiahao Wang
 * @Description 对象结构类
 * @create 2022-05-15 20:12
 */
public class Home {

	private ArrayList<Animal> list = new ArrayList<>();

	public void add(Animal animal) {
		list.add(animal);
	}

	public void action(Person person) {
		for (Animal animal : list) {
			animal.accept(person);
		}
	}
}
