package com.designpatterns.mediator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 10:36
 */
public class Alarm extends Colleague {
	public Alarm(String name, Mediator mediator) {
		super(name, mediator);
		mediator.register(name, this);
	}

	public void sendAlarm(int stateChange) {
		sendMessage(stateChange);
	}

	@Override
	public void sendMessage(int stateChange) {
		this.getMediator().getMessage(stateChange, this.name);
	}
}
