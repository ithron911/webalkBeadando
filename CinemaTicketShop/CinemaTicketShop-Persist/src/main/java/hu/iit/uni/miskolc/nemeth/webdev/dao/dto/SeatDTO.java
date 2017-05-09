package hu.iit.uni.miskolc.nemeth.webdev.dao.dto;

public class SeatDTO {

	private int id;
	private int rowNumber;
	private int seatNumber;
	private boolean isTaken;
	private ScreeningRoomDTO screeningRoom;

	public SeatDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public ScreeningRoomDTO getScreeningRoom() {
		return screeningRoom;
	}

	public void setScreeningRoom(ScreeningRoomDTO screeningRoom) {
		this.screeningRoom = screeningRoom;
	}

	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}
}
