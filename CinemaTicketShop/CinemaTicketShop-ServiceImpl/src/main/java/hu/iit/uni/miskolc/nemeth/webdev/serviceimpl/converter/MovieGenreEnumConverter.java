package hu.iit.uni.miskolc.nemeth.webdev.serviceimpl.converter;

import hu.iit.uni.miskolc.nemeth.webdev.model.MovieGenre;

public final class MovieGenreEnumConverter {

	private MovieGenreEnumConverter() {
	}

	public static MovieGenre convertStringToMovieGenres(String movieGenreValue) {
		MovieGenre movieGenre = null;

		if (MovieGenre.ACTION.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.ACTION;
		} else if (MovieGenre.ADVENTURE.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.ADVENTURE;
		} else if (MovieGenre.ANIMATION.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.ANIMATION;
		} else if (MovieGenre.FANTASY.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.FANTASY;
		} else if (MovieGenre.HORROR.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.HORROR;
		} else if (MovieGenre.SCI_FI.toString().equals(movieGenreValue)) {
			movieGenre = MovieGenre.SCI_FI;
		}

		return movieGenre;
	}
}
