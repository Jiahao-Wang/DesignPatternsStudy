package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiahao Wang
 * @Description 最高子类节点
 * @create 2022-05-15 12:15
 */
public class University extends OrganizationComponent {

	List<OrganizationComponent> organizationComponents = new ArrayList<>();


	public University(String name, String desc) {
		super(name, desc);
	}

	@Override
	protected void add(OrganizationComponent o) {
		organizationComponents.add(o);
	}

	@Override
	protected void remove(OrganizationComponent o) {
		organizationComponents.remove(o);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDesc() {
		return super.getDesc();
	}

	// 输出包含的学院
	@Override
	protected void print() {
		System.out.println(getName() + " " + getDesc());
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
