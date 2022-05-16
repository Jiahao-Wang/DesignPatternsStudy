package com.designpatterns.observer;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-16 00:07
 */
public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

}
