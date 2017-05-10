package hu.iit.uni.miskolc.nemeth.webdev.dao.dto;

public class TicketDTO {

	private int id;
	private UserDTO user;
	private ShowDTO show;
	private SeatDTO seatDTO;

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

	public SeatDTO getSeatDTO() {
		return seatDTO;
	}

	public void setSeatDTO(SeatDTO seatDTO) {
		this.seatDTO = seatDTO;
	}
}
