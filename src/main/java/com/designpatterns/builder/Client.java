package com.designpatterns.builder;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-14 13:45
 */
public class Client {
	public static void main(String[] args) {

		// 声明一个想建造的具体子类
		House house = new House();

		// 提供给 Director
		BuildingDirector buildingDirector = new BuildingDirector(house);

		// Director 开始逐步建造
		buildingDirector.construct();

		buildingDirector.setHouseBuilder(new Apartment());

		buildingDirector.construct();
	}
}
