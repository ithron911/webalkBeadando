package hu.iit.uni.miskolc.nemeth.webdev.controller.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import hu.iit.uni.miskolc.nemeth.webdev.model.Movie;
import hu.iit.uni.miskolc.nemeth.webdev.model.ScreeningRoom;

public class ShowResponse {
	private int id;
	private ScreeningRoom screeningRoom;
	private Movie movie;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy.MM,dd HH:mm:ss", timezone="UTC")
	private Date date;

	public ShowResponse() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ScreeningRoom getScreeningRoom() {
		return screeningRoom;
	}

	public void setScreeningRoom(ScreeningRoom screeningRoom) {
		this.screeningRoom = screeningRoom;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
