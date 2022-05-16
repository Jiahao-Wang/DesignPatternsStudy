package com.designpatterns.state;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 12:54
 */
public class OpenState extends ElevatorState {

	@Override
	public void open() {
		System.out.println("elevator open");
	}

	@Override
	public void close() {
		super.context.setElevatorState(Context.CLOSE_STATE);
		super.context.close();
		System.out.println("open to close");
	}

	@Override
	public void run() {
		// 开启状态不能运行，所以什么也不做
	}

	@Override
	public void stop() {
		// 什么也不做
	}
}
