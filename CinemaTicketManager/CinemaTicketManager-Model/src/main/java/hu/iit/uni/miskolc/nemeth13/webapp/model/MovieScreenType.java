package hu.iit.uni.miskolc.nemeth13.webapp.model;

public enum MovieScreenType {
	SCREEN_3D("3D"),
	SCREEN_2D("2D");

	private String value;

	private MovieScreenType(String type) {
        this.value= type;
    }

	@Override
	public String toString() {
		return value;
	}
}
