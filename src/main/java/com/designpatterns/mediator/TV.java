package com.designpatterns.mediator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 10:33
 */
public class TV extends Colleague {
	public TV(String name, Mediator mediator) {
		super(name, mediator);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void startTv() {
		System.out.println("It's time to StartTv!");
	}

	public void stopTv() {
		System.out.println("StopTv!");
	}
}
