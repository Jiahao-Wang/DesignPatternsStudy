package com.designpatterns.proxy.JDKproxy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 17:40
 */
public class TrainStation implements SellTickets {

	@Override
	public void sell() {
		System.out.println("train station sell tickets");
	}
}
