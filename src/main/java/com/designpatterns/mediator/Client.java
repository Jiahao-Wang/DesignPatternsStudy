package com.designpatterns.mediator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 01:18
 */
public class Client {
	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();

		//创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
		Alarm alarm = new Alarm("alarm", mediator);

		//创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine("coffee machine", mediator);

		//创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
		Curtain curtain = new Curtain("curtains", mediator);
		TV tV = new TV("TV", mediator);

		//让闹钟发出消息
		alarm.sendAlarm(0);
		coffeeMachine.finishCoffee();
		alarm.sendAlarm(1);
	}
}

