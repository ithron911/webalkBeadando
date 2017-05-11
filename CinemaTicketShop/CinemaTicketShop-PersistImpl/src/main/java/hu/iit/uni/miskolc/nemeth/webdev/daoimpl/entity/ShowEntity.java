package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Show")
@Table(name = "Shows")
public class ShowEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ScreeningRoomID")
	private ScreeningRoomEntity screeningRoom;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "MovieID")
	private MovieEntity movie;

	@Column(name = "Date")
	private Timestamp date;

	public ShowEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ScreeningRoomEntity getScreeningRoom() {
		return screeningRoom;
	}

	public void setScreeningRoom(ScreeningRoomEntity screeningRoom) {
		this.screeningRoom = screeningRoom;
	}

	public MovieEntity getMovie() {
		return movie;
	}

	public void setMovie(MovieEntity movie) {
		this.movie = movie;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
}
