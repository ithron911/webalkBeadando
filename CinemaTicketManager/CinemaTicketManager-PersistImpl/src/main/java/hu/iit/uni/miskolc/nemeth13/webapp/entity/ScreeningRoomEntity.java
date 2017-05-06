package hu.iit.uni.miskolc.nemeth13.webapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import hu.iit.uni.miskolc.nemeth13.webapp.model.Cinema;

@Entity
public class ScreeningRoomEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cinemId")
	private Cinema cinema;

	@OneToMany(mappedBy = "screeningRoom")
	private List<SeatEntity> seats;

	public ScreeningRoomEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public List<SeatEntity> getSeats() {
		return seats;
	}

	public void setSeats(List<SeatEntity> seats) {
		this.seats = seats;
	}
}
