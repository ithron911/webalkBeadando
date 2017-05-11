package hu.iit.uni.miskolc.nemeth.webdev.controller.model;

public class TicketRequest {
	private String username;
	private int showId;
	private int seatId;

	public TicketRequest() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
}
