package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Ticket")
@Table(name = "Tickets")
public class TicketEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@OneToOne
	@JoinColumn(name = "Username")
	private UserEntity user;

	@OneToOne
	@JoinColumn(name = "ShowID")
	private ShowEntity show;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SeatID")
	private SeatEntity seatEntity;

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

	public SeatEntity getSeatEntity() {
		return seatEntity;
	}

	public void setSeatEntity(SeatEntity seatEntity) {
		this.seatEntity = seatEntity;
	}
}
