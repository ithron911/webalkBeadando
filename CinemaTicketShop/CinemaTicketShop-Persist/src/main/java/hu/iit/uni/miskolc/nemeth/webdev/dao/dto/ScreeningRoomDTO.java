package hu.iit.uni.miskolc.nemeth.webdev.dao.dto;

import java.util.List;

public class ScreeningRoomDTO {

	private int id;
	private CinemaDTO cinema;
	private List<SeatDTO> seats;

	public ScreeningRoomDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CinemaDTO getCinema() {
		return cinema;
	}

	public void setCinema(CinemaDTO cinema) {
		this.cinema = cinema;
	}

	public List<SeatDTO> getSeats() {
		return seats;
	}

	public void setSeats(List<SeatDTO> seats) {
		this.seats = seats;
	}
}
