package com.designpatterns.strategy;

/**
 * @author Jiahao Wang
 * @Description 这个模式有什么用啊。。。。。
 * @create 2022-05-16 13:50
 */
public class Client {
	public static void main(String[] args) {
		SalesPerson salesPerson = new SalesPerson(new StrategyB());

		salesPerson.salesPersonShow();

		salesPerson.setStrategy(new StrategyC());

		salesPerson.salesPersonShow();
	}
}
