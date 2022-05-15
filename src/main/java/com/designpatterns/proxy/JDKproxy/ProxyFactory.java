package com.designpatterns.proxy.JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 17:47
 */
public class ProxyFactory {

	private TrainStation trainStation = new TrainStation();

	public SellTickets getProxyObject() {

		/*
		 * ClassLoader loader：类加载器，用于加载代理类。可以通过目标对象获取类加载器
		 * Class<?>[] interfaces：代理类的实现接口的字节码对象
		 * InvocationHandler h：代理对象的调用处理程序

		 */
		SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
				trainStation.getClass().getClassLoader(),
				trainStation.getClass().getInterfaces(),
				new InvocationHandler() {

					/*
					 * Object proxy：代理对象。和 proxyObject 是同一个对象。在 invoke 方法中基本不用
					 * Method method：对接口中的方法进行封装的 method 对象
					 * Object[] args ： 调用方法的实际参数
					 * 返回值：???
					 */
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("additional fee!");
						Object obj = method.invoke(trainStation, args);
						return obj;
					}
				}
		);
		return proxyObject;
	}
}
