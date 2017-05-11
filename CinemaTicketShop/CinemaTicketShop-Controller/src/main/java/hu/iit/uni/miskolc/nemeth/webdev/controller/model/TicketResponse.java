package hu.iit.uni.miskolc.nemeth.webdev.controller.model;

import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;
import hu.iit.uni.miskolc.nemeth.webdev.model.User;

public class TicketResponse {
	private int id;
	private User user;
	private ShowResponse show;
	private Seat seat;

	public TicketResponse() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ShowResponse getShow() {
		return show;
	}

	public void setShow(ShowResponse show) {
		this.show = show;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
}
