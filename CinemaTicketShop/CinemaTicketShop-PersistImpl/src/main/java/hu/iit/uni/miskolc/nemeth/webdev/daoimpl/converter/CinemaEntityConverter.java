package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.CinemaEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Cinema;

public final class CinemaEntityConverter {

	private CinemaEntityConverter() {
	}

	public static Cinema convertCinemaEntityToModel(CinemaEntity cinemaEntity) {
		Cinema cinema = new Cinema();
		cinema.setId(cinemaEntity.getId());
		cinema.setAddress(cinemaEntity.getAddress());
		cinema.setName(cinemaEntity.getName());

		return cinema;
	}
}
