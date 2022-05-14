package com.designpatterns.builder;

/**
 * @author Jiahao Wang
 * @Description 定义建造产品有哪些步骤
 * @create 2022-05-14 13:45
 */
public abstract class HouseBuilder {
	protected Building building = new Building();

	public abstract void buildBase();

	public abstract void buildWall();

	public abstract void buildRoof();

	public Building buildHouse() {
		return building;
	}
}
