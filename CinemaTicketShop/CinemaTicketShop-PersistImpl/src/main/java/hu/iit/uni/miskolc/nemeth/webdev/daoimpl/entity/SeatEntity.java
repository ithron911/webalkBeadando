package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Seat")
@Table(name = "Seats")
public class SeatEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "RowNumber")
	private int rowNumber;

	@Column(name = "SeatNumber;")
	private int seatNumber;

	@Column(name = "IsTaken")
	private boolean isTaken;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ScreeningRoomID")
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
