package com.designpatterns.adapter.classadapter;

/**
 * @author Jiahao Wang
 * @Description 适配器
 * @create 2022-05-14 19:53
 */
public class VoltageAdapter extends Voltage220V implements IVotage5V {
	@Override
	public int output5V() {
		int srcV = output220V();
		int dstV = srcV / 44;
		return dstV;
	}
}
