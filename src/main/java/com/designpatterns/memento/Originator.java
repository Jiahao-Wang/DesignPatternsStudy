package com.designpatterns.memento;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 11:52
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveState() {
		return new Memento(state);
	}

	public void restoreState(Memento memento) {
		state = memento.getState();
	}

}
