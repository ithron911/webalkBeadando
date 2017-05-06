package hu.iit.uni.miskolc.nemeth13.webapp.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import hu.iit.uni.miskolc.nemeth13.webapp.model.MovieScreenType;

@Converter
public class MovieScreenTypeConverter implements AttributeConverter<MovieScreenType, String> {

	public MovieScreenTypeConverter() {
	}

	@Override
	public String convertToDatabaseColumn(MovieScreenType movieScreenType) {
		return movieScreenType.toString();
	}

	@Override
	public MovieScreenType convertToEntityAttribute(String movieScreenTypeValue) {
		MovieScreenType movieScreenType = null;

		if (MovieScreenType.SCREEN_2D.toString().equals(movieScreenTypeValue)) {
			movieScreenType = MovieScreenType.SCREEN_2D;
		} else if (MovieScreenType.SCREEN_3D.toString().equals(movieScreenTypeValue)) {
			movieScreenType = MovieScreenType.SCREEN_3D;
		}

		return movieScreenType;
	}

}
