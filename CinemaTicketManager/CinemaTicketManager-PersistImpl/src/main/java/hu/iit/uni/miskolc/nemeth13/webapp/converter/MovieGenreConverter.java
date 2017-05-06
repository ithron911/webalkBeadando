package hu.iit.uni.miskolc.nemeth13.webapp.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import hu.iit.uni.miskolc.nemeth13.webapp.model.MovieGenre;

@Converter
public class MovieGenreConverter implements AttributeConverter<MovieGenre, String> {

	public MovieGenreConverter() {
	}

	@Override
	public String convertToDatabaseColumn(MovieGenre movieGenre) {
		return movieGenre.toString();
	}

	@Override
	public MovieGenre convertToEntityAttribute(String movieGenreValue) {
		MovieGenre movieGenre = null;

		if (MovieGenre.SCI_FI.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.SCI_FI;
		} else if (MovieGenre.ACTION.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.ACTION;
		} else if (MovieGenre.HORROR.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.HORROR;
		} else if (MovieGenre.FANTASY.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.FANTASY;
		} else if (MovieGenre.ADVENTURE.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.ADVENTURE;
		} else if (MovieGenre.ANIMATION.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.ANIMATION;
		}

		return movieGenre;
	}

}
