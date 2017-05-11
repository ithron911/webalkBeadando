package hu.iit.uni.miskolc.nemeth.webdev.controller.model;

public class TicketRequest {
	private int userId;
	private int showId;
	private int seatId;

	public TicketRequest() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
