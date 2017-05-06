package hu.iit.uni.miskolc.nemeth13.webapp.model;

public enum ScreenType {
	SCREEN_3D("3D"),
	SCREEN_2D("2D");

	private String value;

	private ScreenType(String type) {
        this.value= type;
    }

	@Override
	public String toString() {
		return value;
	}
}
