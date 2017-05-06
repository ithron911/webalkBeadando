package hu.iit.uni.miskolc.nemeth13.webapp.entity;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import hu.iit.uni.miskolc.nemeth13.webapp.converter.MovieGenreConverter;
import hu.iit.uni.miskolc.nemeth13.webapp.model.MovieAgeRestriction;
import hu.iit.uni.miskolc.nemeth13.webapp.model.MovieGenre;
import hu.iit.uni.miskolc.nemeth13.webapp.model.MovieScreenType;

@Entity
public class MovieEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private int cost;

	@Convert(converter = MovieGenreConverter.class)
	private MovieGenre genre;

	@Convert(converter = MovieAgeRestriction.class)
	private MovieAgeRestriction ageResctriction;

	@Convert(converter = MovieScreenType.class)
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
