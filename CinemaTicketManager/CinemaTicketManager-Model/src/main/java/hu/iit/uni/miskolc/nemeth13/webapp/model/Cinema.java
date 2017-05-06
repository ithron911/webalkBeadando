package hu.iit.uni.miskolc.nemeth13.webapp.model;

import java.util.List;

public class Cinema {

	private int id;
	private String address;
	private String name;
	private List<ScreeningRoom> screeningRooms;

	public Cinema() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ScreeningRoom> getScreeningRooms() {
		return screeningRooms;
	}

	public void setScreeningRooms(List<ScreeningRoom> screeningRooms) {
		this.screeningRooms = screeningRooms;
	}
}
