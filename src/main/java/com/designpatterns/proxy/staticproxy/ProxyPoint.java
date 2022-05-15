package com.designpatterns.proxy.staticproxy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 17:41
 */
public class ProxyPoint implements SellTickets {

	private TrainStation trainStation = new TrainStation();

	@Override
	public void sell() {
		System.out.println("extra: addition fees");
		System.out.println("proxy point sell tickets");
	}
}
