package com.designpatterns.composite;

/**
 * @author Jiahao Wang
 * @Description 基类，所有节点和叶子都继承自此
 * @create 2022-05-15 12:12
 */
public abstract class OrganizationComponent {
	private String name;
	private String desc;

	public OrganizationComponent(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	protected void add(OrganizationComponent o) {
		throw new UnsupportedOperationException();
	}

	protected void remove(OrganizationComponent o) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	protected abstract void print();
}
