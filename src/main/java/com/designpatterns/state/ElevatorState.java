package com.designpatterns.state;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 12:53
 */
public abstract class ElevatorState {

	protected Context context;

	public void setContext(Context context) {
		this.context = context;
	}

	public abstract void open();

	public abstract void close();

	public abstract void run();

	public abstract void stop();
}
