package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String genre;

	@Column(name = "AgeResctriction")
	private String ageResctriction;

	@Column(name = "ScreenType")
	private String screenType;

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAgeResctriction() {
		return ageResctriction;
	}

	public void setAgeResctriction(String ageResctriction) {
		this.ageResctriction = ageResctriction;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
}
