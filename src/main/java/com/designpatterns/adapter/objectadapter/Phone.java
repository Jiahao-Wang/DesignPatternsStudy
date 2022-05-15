package com.designpatterns.adapter.objectadapter;

/**
 * @author Jiahao Wang
 * @Description 需要使用适配器的类
 * @create 2022-05-14 19:55
 */
public class Phone {

	public void Charge(IVotage5V iVotage5V) {
		if (iVotage5V.output5V() == 5) {
			System.out.println("Charging");
		} else {
			System.out.println("Can not Charge");
		}
	}
}
