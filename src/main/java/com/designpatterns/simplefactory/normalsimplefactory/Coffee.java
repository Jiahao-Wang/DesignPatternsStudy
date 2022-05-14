package com.designpatterns.simplefactory.normalsimplefactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 22:47
 */
public abstract class Coffee {

	public abstract String getName();

	//加糖
	public void addsugar() {
		System.out.println("加糖");
	}

	//加奶
	public void addMilk() {
		System.out.println("加奶");
	}
}
