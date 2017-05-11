package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import hu.iit.uni.miskolc.nemeth.webdev.model.MovieAgeRestriction;
import hu.iit.uni.miskolc.nemeth.webdev.model.MovieGenre;
import hu.iit.uni.miskolc.nemeth.webdev.model.MovieScreenType;

@Entity(name = "Movie")
@Table(name = "Movies")
public class MovieEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "Title")
	private String title;

	@Column(name = "Cost")
	private int cost;

	@Column(name = "Genre")
	private MovieGenre genre;

	@Column(name = "AgeResctriction")
	private MovieAgeRestriction  ageResctriction;

	@Column(name = "ScreenType")
	private MovieScreenType screenType;

	public MovieEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public MovieGenre getGenre() {
		return genre;
	}

	public void setGenre(MovieGenre genre) {
		this.genre = genre;
	}

	public MovieAgeRestriction getAgeResctriction() {
		return ageResctriction;
	}

	public void setAgeResctriction(MovieAgeRestriction ageResctriction) {
		this.ageResctriction = ageResctriction;
	}

	public MovieScreenType getScreenType() {
		return screenType;
	}

	public void setScreenType(MovieScreenType screenType) {
		this.screenType = screenType;
	}
}
