package com.designpatterns.adapter.objectadapter;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 19:57
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("对象适配器模式：");
		Phone phone = new Phone();
		phone.Charge(new VoltageAdapter(new Voltage220V()));
	}
}
