package hu.iit.uni.miskolc.nemeth13.webapp.dao.dto;

import java.util.Date;

public class ShowDTO {

	private int id;
	private CinemaDTO cinema;
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

	public CinemaDTO getCinema() {
		return cinema;
	}

	public void setCinema(CinemaDTO cinema) {
		this.cinema = cinema;
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
