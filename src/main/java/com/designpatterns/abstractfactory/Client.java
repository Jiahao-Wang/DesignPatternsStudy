package com.designpatterns.abstractfactory;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-13 23:59
 */
public class Client {
	public static void main(String[] args) {
		ItalianDessertFactory italianDessertFactory = new ItalianDessertFactory();

		Coffee coffee = italianDessertFactory.createCoffee();
		Dessert dessert = italianDessertFactory.createDessert();

		System.out.println(coffee.getName());
		dessert.show();

	}
}
