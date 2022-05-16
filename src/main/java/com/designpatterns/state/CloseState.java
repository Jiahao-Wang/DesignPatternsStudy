package com.designpatterns.state;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 12:54
 */
public class CloseState extends ElevatorState {

	@Override
	public void open() {
		super.context.setElevatorState(Context.OPEN_STATE);
		super.context.open();
		System.out.println("close to open");
	}

	@Override
	public void close() {
		System.out.println("elevator close");
	}

	@Override
	public void run() {
		super.context.setElevatorState(Context.RUN_STATE);
		super.context.run();
		System.out.println("close to run");
	}

	@Override
	public void stop() {
		super.context.setElevatorState(Context.STOP_STATE);
		super.context.stop();
		System.out.println("close to stop");
	}
}
