package com.designpatterns.mediator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 10:34
 */
public class CoffeeMachine extends Colleague {
	public CoffeeMachine(String name, Mediator mediator) {
		super(name, mediator);
		mediator.register(name, this);
	}

	@Override
	public void sendMessage(int stateChange) {
		// TODO Auto-generated method stub
		this.getMediator().getMessage(stateChange, this.name);
	}

	public void startCoffee() {
		System.out.println("It's time to startcoffee!");
	}

	public void finishCoffee() {

		System.out.println("After 5 minutes!");
		System.out.println("Coffee is ok!");
		sendMessage(0);
	}
}
