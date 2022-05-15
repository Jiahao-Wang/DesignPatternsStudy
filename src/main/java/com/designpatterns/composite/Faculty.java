package com.designpatterns.composite;


/**
 * @author Jiahao Wang
 * @Description 叶子节点，不需要 add 和 remove 了，也不需要 ArrayList 了
 * @create 2022-05-15 12:19
 */
public class Faculty extends OrganizationComponent {

	public Faculty(String name, String desc) {
		super(name, desc);
	}


	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDesc() {
		return super.getDesc();
	}

	// 输出自己的名字就好
	@Override
	protected void print() {
		System.out.println(this.getName());
	}
}
