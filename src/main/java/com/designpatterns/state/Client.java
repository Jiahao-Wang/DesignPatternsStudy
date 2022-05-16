package com.designpatterns.state;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 13:05
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setElevatorState(new CloseState());

		context.open();

		context.close();

		context.run();

		context.stop();

	}
}
