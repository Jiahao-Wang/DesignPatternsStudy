package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiahao Wang
 * @Description 第二子类节点
 * @create 2022-05-15 12:21
 */
public class Department extends OrganizationComponent {
	List<OrganizationComponent> organizationComponents = new ArrayList<>();


	public Department(String name, String desc) {
		super(name, desc);
	}

	// 实际开发中，add 不同组织，业务逻辑可能不同
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
