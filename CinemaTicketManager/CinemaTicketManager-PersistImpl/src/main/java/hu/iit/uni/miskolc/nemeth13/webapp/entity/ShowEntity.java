package hu.iit.uni.miskolc.nemeth13.webapp.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import hu.iit.uni.miskolc.nemeth13.webapp.model.Cinema;
import hu.iit.uni.miskolc.nemeth13.webapp.model.Movie;

@Entity
public class ShowEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne
	@JoinColumn(name = "cinemaId")
	private Cinema cinema;

	@OneToOne
	@JoinColumn(name = "movieId")
	private Movie movie;

	private Timestamp date;

	public ShowEntity() {
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

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
}
