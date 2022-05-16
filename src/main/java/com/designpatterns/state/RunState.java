package com.designpatterns.state;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 12:54
 */
public class RunState extends ElevatorState {

	@Override
	public void open() {

	}

	@Override
	public void close() {

	}

	@Override
	public void run() {
		System.out.println("elevator running");
	}

	@Override
	public void stop() {
		super.context.setElevatorState(Context.STOP_STATE);
		super.context.stop();
		System.out.println("run to stop");
	}
}
