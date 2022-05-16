package com.designpatterns.mediator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 01:08
 */
public abstract class Mediator {
	public abstract void register(String colleagueName, Colleague colleague);

	public abstract void getMessage(int stateChange, String colleagueName);

	public abstract void sendMessage();
}
