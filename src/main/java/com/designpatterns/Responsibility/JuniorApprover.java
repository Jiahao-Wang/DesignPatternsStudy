package com.designpatterns.Responsibility;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 14:07
 */
public class JuniorApprover extends Approver {
	public JuniorApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(Request request) {
		if (request.getPrice() <= 5000) {
			System.out.println("id = " + request.getId() + " approved by " + this.name);
		} else {
			approver.processRequest(request);
		}
	}
}
