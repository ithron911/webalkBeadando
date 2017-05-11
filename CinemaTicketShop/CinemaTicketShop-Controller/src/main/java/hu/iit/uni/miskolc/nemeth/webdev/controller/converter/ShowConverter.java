package hu.iit.uni.miskolc.nemeth.webdev.controller.converter;

import java.util.ArrayList;
import java.util.List;

import hu.iit.uni.miskolc.nemeth.webdev.controller.model.ShowResponse;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;

public final class ShowConverter {

	private ShowConverter() {
	}

	public static List<ShowResponse> convertShowModelsToResponses(List<Show> shows) {
		List<ShowResponse> showResponses = new ArrayList<>();

		for (Show show : shows) {
			showResponses.add(convertShowModelToResponse(show));
		}

		return showResponses;
	}

	public static ShowResponse convertShowModelToResponse(Show show) {
		ShowResponse showResponse = new ShowResponse();
		showResponse.setId(show.getId());
		showResponse.setDate(show.getDate());
		showResponse.setMovie(show.getMovie());
		showResponse.setScreeningRoom(show.getScreeningRoom());

		return showResponse;
	}
}
