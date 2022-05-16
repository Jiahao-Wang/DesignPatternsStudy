package com.designpatterns.Responsibility;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 14:05
 */
public abstract class Approver {
	// 下一个处理者
	Approver approver;
	String name;

	public Approver(String name) {
		this.name = name;
	}

	// 下一个处理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	// 要子类具体实现，所以 abstract
	public abstract void processRequest(Request request);
}
