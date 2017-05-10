package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
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

	@OneToOne
	@JoinColumn(name = "CinemaID")
	private CinemaEntity cinema;

	@OneToOne
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

	public CinemaEntity getCinema() {
		return cinema;
	}

	public void setCinema(CinemaEntity cinema) {
		this.cinema = cinema;
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
