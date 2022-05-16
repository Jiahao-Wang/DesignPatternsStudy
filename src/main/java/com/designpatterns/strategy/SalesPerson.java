package com.designpatterns.strategy;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 13:49
 */
public class SalesPerson {

	private Strategy strategy;

	public SalesPerson(Strategy strategy) {
		this.strategy = strategy;
	}

	public void salesPersonShow() {
		strategy.show();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
