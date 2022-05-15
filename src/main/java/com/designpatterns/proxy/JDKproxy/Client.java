package com.designpatterns.proxy.JDKproxy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 17:52
 */
public class Client {
	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();

		SellTickets proxyObject = factory.getProxyObject();

		proxyObject.sell();

		while (true) {
		}
	}
}
