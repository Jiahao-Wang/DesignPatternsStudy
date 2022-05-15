package com.designpatterns.template;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 18:31
 */
public class Client {
	public static void main(String[] args) {
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();

		peanutSoyaMilk.make();

		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}
}
