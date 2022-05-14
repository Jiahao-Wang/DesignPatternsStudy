package com.designpatterns.builder;

/**
 * @author Jiahao Wang
 * @Description 具体产品，
 * @create 2022-05-14 13:44
 */
public class House extends HouseBuilder {
	@Override
	public void buildBase() {
		System.out.println("build house base");
	}

	@Override
	public void buildWall() {
		System.out.println("build house wall");
	}

	@Override
	public void buildRoof() {
		System.out.println("build house roof");
	}


}
