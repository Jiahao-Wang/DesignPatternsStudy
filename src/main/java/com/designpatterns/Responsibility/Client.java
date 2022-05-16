package com.designpatterns.Responsibility;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 14:16
 */
public class Client {
	public static void main(String[] args) {
		Request request = new Request(1, 28800, 1);

		JuniorApprover juniorApprover = new JuniorApprover("junior");
		SeniorApprover seniorApprover = new SeniorApprover("senior");
		BossApprover bossApprover = new BossApprover("boss");


		// 设置成环状，从任何一级开始处理都能得到正确的处理者
		// 如果能保证从最低级开始处理，可以设置成链状
		juniorApprover.setApprover(seniorApprover);
		seniorApprover.setApprover(bossApprover);
		bossApprover.setApprover(juniorApprover);

		juniorApprover.processRequest(request);
	}
}
