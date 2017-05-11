package hu.iit.uni.miskolc.nemeth.webdev.model;

public class ScreeningRoom {

	private int id;
	private Cinema cinema;

	public ScreeningRoom() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
}
