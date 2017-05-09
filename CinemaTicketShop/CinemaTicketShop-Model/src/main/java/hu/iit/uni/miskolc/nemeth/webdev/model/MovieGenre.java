package hu.iit.uni.miskolc.nemeth.webdev.model;

public enum MovieGenre {
	SCI_FI("SCI_FI"),
	ACTION("ACTION"),
	HORROR("HORROR"),
	FANTASY("FANTASY"),
	ADVENTURE("ADVENTURE"),
	ANIMATION("ANIMATION");

	private String value;

	private MovieGenre(String genre) {
        this.value= genre;
    }

	@Override
	public String toString() {
		return value;
	}

	public void setMovieGenre(String genre) {
		this.value = genre;
	}
}
