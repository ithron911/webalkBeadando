package hu.iit.uni.miskolc.nemeth.webdev.model;

public class Movie {

	private int id;
	private String title;
	private MovieGenre genre;
	private MovieAgeRestriction ageResctriction;
	private MovieScreenType screenType;
	private int cost;

	public Movie() {
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
