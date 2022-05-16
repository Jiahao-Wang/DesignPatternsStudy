package com.designpatterns.mediator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 01:09
 */
public abstract class Colleague {

	protected String name;
	protected Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public Colleague(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public abstract void sendMessage(int stateChange);
}
