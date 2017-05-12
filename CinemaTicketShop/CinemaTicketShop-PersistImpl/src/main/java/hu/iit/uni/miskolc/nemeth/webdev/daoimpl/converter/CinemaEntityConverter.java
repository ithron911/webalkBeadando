package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.CinemaEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Cinema;

public final class CinemaEntityConverter {

	private CinemaEntityConverter() {
	}

	public static List<Cinema> convertCinemaEntitiesToModels(List<CinemaEntity> cinemaEntities) {
		List<Cinema> cinemas = new ArrayList<>();

		for (CinemaEntity cinemaEntity : cinemaEntities) {
			cinemas.add(convertCinemaEntityToModel(cinemaEntity));
		}

		return cinemas;
	}
	public static Cinema convertCinemaEntityToModel(CinemaEntity cinemaEntity) {
		Cinema cinema = new Cinema();
		cinema.setId(cinemaEntity.getId());
		cinema.setAddress(cinemaEntity.getAddress());
		cinema.setName(cinemaEntity.getName());

		return cinema;
	}
}
