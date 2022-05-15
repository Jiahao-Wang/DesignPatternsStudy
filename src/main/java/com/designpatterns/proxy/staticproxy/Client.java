package com.designpatterns.proxy.staticproxy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 17:42
 */
public class Client {
	public static void main(String[] args) {
		ProxyPoint proxyPoint = new ProxyPoint();

		proxyPoint.sell();
	}
}
