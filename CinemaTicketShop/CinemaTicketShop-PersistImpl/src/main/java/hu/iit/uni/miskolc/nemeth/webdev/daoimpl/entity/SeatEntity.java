package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Seat")
public class SeatEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int rowNumber;
	private int seatNumber;
	private boolean isTaken;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "screeningRoomId")
	private ScreeningRoomEntity screeningRoom;

	public SeatEntity() {
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

	public boolean isTaken() {
		return isTaken;
	}

	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}

	public ScreeningRoomEntity getScreeningRoom() {
		return screeningRoom;
	}

	public void setScreeningRoom(ScreeningRoomEntity screeningRoom) {
		this.screeningRoom = screeningRoom;
	}
}
