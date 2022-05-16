package com.designpatterns.memento;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 11:52
 */
public class Memento {
	private String state;

	public String getState() {
		return state;
	}

	public Memento(String state) {
		this.state = state;
	}
}
