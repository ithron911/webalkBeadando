package hu.iit.uni.miskolc.nemeth13.webapp.dao.dto;

public class CinemaDTO {

	private int id;
	private String address;
	private String name;

	public CinemaDTO() {
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
}
