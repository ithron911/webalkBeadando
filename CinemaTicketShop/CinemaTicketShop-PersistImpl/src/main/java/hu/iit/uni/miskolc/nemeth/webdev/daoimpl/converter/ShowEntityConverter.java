package hu.iit.uni.miskolc.nemeth.webdev.daoimpl.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.daoimpl.entity.ShowEntity;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;

public final class ShowEntityConverter {

	private ShowEntityConverter() {
	}

	public static List<Show> convertShowEntitiesToModels(List<ShowEntity> showEntities) {
		List<Show> shows = new ArrayList<>();

		 for (ShowEntity showEntity : showEntities) {
			 shows.add(convertShowEntityToModel(showEntity));
		 }

		return shows;
	}

	public static Show convertShowEntityToModel(ShowEntity showEntity) {
		Show show = new Show();
		show.setId(showEntity.getId());
		show.setScreeningRoom(ScreeningRoomEntityConverter.convertScreeningRoomEntityToModel(showEntity.getScreeningRoom()));
		show.setDate(showEntity.getDate());
		show.setMovie(MovieEntityConverter.convertMovieEntityToModels(showEntity.getMovie()));
		

		return show;
	}
}
