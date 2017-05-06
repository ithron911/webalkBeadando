package hu.iit.uni.miskolc.nemeth13.webapp.model;

import java.util.List;

public class ScreeningRoom {

	private int id;
	private Cinema cinema;
	private List<Seat> seats;

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

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
}
