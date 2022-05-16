package com.designpatterns.memento;

import java.util.ArrayList;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 11:55
 */
public class Caretaker {
	private ArrayList<Memento> mementos = new ArrayList<>();

	public void add(Memento memento) {
		mementos.add(memento);
	}

	public Memento get(int index) {
		return mementos.get(index);
	}
}
