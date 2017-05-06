package hu.iit.uni.miskolc.nemeth13.webapp.dao.dto;

public class TicketDTO {

	private int id;
	private UserDTO user;
	private ShowDTO show;

	public TicketDTO() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public ShowDTO getShow() {
		return show;
	}
	public void setShow(ShowDTO show) {
		this.show = show;
	}
}
