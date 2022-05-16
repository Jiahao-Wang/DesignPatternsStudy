package com.designpatterns.mediator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 10:31
 */
public class Curtain extends Colleague {
	public Curtain(String name, Mediator mediator) {
		super(name, mediator);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		// TODO Auto-generated method stub
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}
}
