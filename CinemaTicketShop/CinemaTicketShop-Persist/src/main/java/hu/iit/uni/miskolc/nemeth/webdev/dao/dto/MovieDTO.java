package hu.iit.uni.miskolc.nemeth.webdev.dao.dto;

public class MovieDTO {

	private int id;
	private String title;
	private String genre;
	private String ageResctriction;
	private String screenType;
	private int cost;

	public MovieDTO() {
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
