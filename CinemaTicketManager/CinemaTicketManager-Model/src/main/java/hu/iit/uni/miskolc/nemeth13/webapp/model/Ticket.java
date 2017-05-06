package hu.iit.uni.miskolc.nemeth13.webapp.model;

public class Ticket {

	private int id;
	private User user;
	private Show show;

	public Ticket() {
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
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
}
