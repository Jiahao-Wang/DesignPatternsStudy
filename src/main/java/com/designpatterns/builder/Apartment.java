package com.designpatterns.builder;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 18:38
 */
public class Apartment extends HouseBuilder {

	@Override
	public void buildBase() {
		System.out.println("build apartment base");
	}

	@Override
	public void buildWall() {
		System.out.println("build apartment wall");
	}

	@Override
	public void buildRoof() {
		System.out.println("build apartment roof");
	}
}
