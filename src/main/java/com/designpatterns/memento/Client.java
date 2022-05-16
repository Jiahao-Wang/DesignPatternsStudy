package com.designpatterns.memento;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 11:57
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.setState("state1: aaaaa");

		caretaker.add(originator.saveState());

		originator.setState("state2: bbbbb");

		originator.setState("state3: ccccc");

		System.out.println("current state:" + originator.getState());

		// restore to state 1:

		originator.restoreState(caretaker.get(0));

		System.out.println("current state:" + originator.getState());
	}
}
