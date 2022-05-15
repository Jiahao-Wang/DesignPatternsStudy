package com.designpatterns.adapter.objectadapter;

/**
 * @author Jiahao Wang
 * @Description 适配器，由继承变为聚合
 * @create 2022-05-14 19:53
 */
public class VoltageAdapter implements IVotage5V {

	private Voltage220V voltage220V;

	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V = voltage220V;
	}

	@Override
	public int output5V() {
		int dstV = 0;
		if (null != voltage220V) {
			int srcV = voltage220V.output220V();
			dstV = srcV / 44;
		}

		return dstV;
	}
}
