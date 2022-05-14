package com.designpatterns.abstractfactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 23:55
 */
public interface DessertFactory {
	Coffee createCoffee();

	Dessert createDessert();
}
