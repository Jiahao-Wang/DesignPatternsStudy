package com.designpatterns.facade;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 13:09
 */
public class TheaterFacade {

	private DVDPlayer dvdPlayer;
	private Popcorn popcorn;
	private Projector projector;

	public TheaterFacade() {
		this.dvdPlayer = DVDPlayer.getInstance();
		this.popcorn = Popcorn.getInstance();
		this.projector = Projector.getInstance();
	}

	public void ready() {
		dvdPlayer.on();
		popcorn.on();
		projector.on();
	}

	public void play() {
		dvdPlayer.play();
		projector.focus();
	}

	public void end() {
		dvdPlayer.off();
		popcorn.off();
		projector.off();
	}
}
