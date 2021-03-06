package hu.iit.uni.miskolc.nemeth.webdev.model;

public enum MovieAgeRestriction {
	GENERAL("G"),
	PARENTAL_GUIDENCE("PG"),
	RESTRICTED("R");

	private String value;

	private MovieAgeRestriction(String restriction) {
        this.value= restriction;
    }

	@Override
	public String toString() {
		return value;
	}
}
