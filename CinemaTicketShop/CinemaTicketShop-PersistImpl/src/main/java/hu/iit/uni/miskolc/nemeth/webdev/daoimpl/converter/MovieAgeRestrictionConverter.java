package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import hu.iit.uni.miskolc.nemeth.webdev.model.MovieAgeRestriction;

@Converter
public class MovieAgeRestrictionConverter implements AttributeConverter<MovieAgeRestriction, String>{

	public MovieAgeRestrictionConverter() {
	}

	@Override
	public String convertToDatabaseColumn(MovieAgeRestriction movieAgeRestriction) {
		return movieAgeRestriction.toString();
	}

	@Override
	public MovieAgeRestriction convertToEntityAttribute(String movieAgeRestrictionValue) {
		MovieAgeRestriction movieAgeRestriction = null;

		if (MovieAgeRestriction.GENERAL.toString().equals(movieAgeRestrictionValue)) {
			movieAgeRestriction = MovieAgeRestriction.GENERAL;
		} else if (MovieAgeRestriction.PARENTAL_GUIDENCE.toString().equals(movieAgeRestrictionValue)) {
			movieAgeRestriction = MovieAgeRestriction.PARENTAL_GUIDENCE;
		} else if (MovieAgeRestriction.RESTRICTED.toString().equals(movieAgeRestrictionValue)) {
			movieAgeRestriction = MovieAgeRestriction.RESTRICTED;
		}

		return movieAgeRestriction;
	}

}
