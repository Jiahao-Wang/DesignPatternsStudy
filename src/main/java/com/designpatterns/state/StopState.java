package com.designpatterns.state;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 12:54
 */
public class StopState extends ElevatorState {

	@Override
	public void open() {
		super.context.setElevatorState(Context.OPEN_STATE);
		super.context.getElevatorState().open();
		System.out.println("stop to open");
	}

	@Override
	public void close() {
		super.context.setElevatorState(Context.CLOSE_STATE);
		super.context.getElevatorState().close();
		System.out.println("stop to close");
	}

	@Override
	public void run() {
		super.context.setElevatorState(Context.RUN_STATE);
		super.context.getElevatorState().run();
		System.out.println("stop to run");
	}

	@Override
	public void stop() {
		System.out.println("elevator stop");
	}
}
