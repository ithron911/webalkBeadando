package hu.iit.uni.miskolc.nemeth13.webapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TicketEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@OneToOne
	@JoinColumn(name = "userId")
	private UserEntity user;

	@OneToOne
	@JoinColumn(name = "showId")
	private ShowEntity show;

	public TicketEntity() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public ShowEntity getShow() {
		return show;
	}

	public void setShow(ShowEntity show) {
		this.show = show;
	}
}
