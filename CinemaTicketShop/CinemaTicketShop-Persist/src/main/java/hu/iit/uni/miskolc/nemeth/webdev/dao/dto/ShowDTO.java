package hu.iit.uni.miskolc.nemeth.webdev.dao.dto;

import java.util.Date;

public class ShowDTO {

	private int id;
	private ScreeningRoomDTO screeningRoom;
	private MovieDTO movie;
	private Date date;

	public ShowDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ScreeningRoomDTO getScreeningRoom() {
		return screeningRoom;
	}

	public void setScreeningRoom(ScreeningRoomDTO screeningRoom) {
		this.screeningRoom = screeningRoom;
	}

	public MovieDTO getMovie() {
		return movie;
	}

	public void setMovie(MovieDTO movie) {
		this.movie = movie;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
