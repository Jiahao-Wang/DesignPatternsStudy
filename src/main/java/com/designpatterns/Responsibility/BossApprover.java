package com.designpatterns.Responsibility;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 14:10
 */
public class BossApprover extends Approver {
	public BossApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(Request request) {
		if (request.getPrice() > 10000) {
			System.out.println("id = " + request.getId() + " approved by " + this.name);
		} else {
			approver.processRequest(request);
		}
	}
}
