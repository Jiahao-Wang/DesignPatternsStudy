package com.designpatterns.builder;

/**
 * @author Jiahao Wang
 * @Description 抽象产品类，定义产品有什么属性
 * @create 2022-05-14 13:26
 */
public class Building {
	private String base;
	private String wall;
	private String roof;

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}
}
