package com.designpatterns.flyweight;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:43
 */
public class ConcreteWebsite extends Website {

	private String type = "";

	public ConcreteWebsite(String type) {
		this.type = type;
	}

	@Override
	public void use(User user) {
		System.out.println(this.type + " user: " + user.getName());
	}
}
