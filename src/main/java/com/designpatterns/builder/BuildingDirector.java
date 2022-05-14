package com.designpatterns.builder;

/**
 * @author Jiahao Wang
 * @Description 按照传入的 HouseBuilder 的具体子类，逐步建造产品
 * @create 2022-05-14 13:45
 */
public class BuildingDirector {
	HouseBuilder houseBuilder;

	public BuildingDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public Building construct() {
		houseBuilder.buildBase();
		houseBuilder.buildWall();
		houseBuilder.buildRoof();

		return houseBuilder.buildHouse();
	}
}
