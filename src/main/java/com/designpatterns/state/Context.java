package com.designpatterns.state;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 12:53
 */
public class Context {

	// 定义对应状态对象的常量
	public final static OpenState OPEN_STATE = new OpenState();
	public final static RunState RUN_STATE = new RunState();
	public final static CloseState CLOSE_STATE = new CloseState();
	public final static StopState STOP_STATE = new StopState();

	// 当前状态变量
	private ElevatorState elevatorState;

	public ElevatorState getElevatorState() {
		return elevatorState;
	}

	public void setElevatorState(ElevatorState elevatorState) {
		this.elevatorState = elevatorState;
		this.elevatorState.setContext(this);
	}

	public void open() {
		this.elevatorState.open();
	}

	public void close() {
		this.elevatorState.close();
	}

	public void run() {
		this.elevatorState.run();
	}

	public void stop() {
		this.elevatorState.stop();
	}


}
