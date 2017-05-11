package hu.iit.uni.miskolc.nemeth.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.controller.converter.ShowConverter;
import hu.iit.uni.miskolc.nemeth.webdev.controller.model.ShowResponse;
import hu.iit.uni.miskolc.nemeth.webdev.model.Show;
import hu.iit.uni.miskolc.nemeth.webdev.service.ShowService;

@RestController
public class ShowController {

	@Autowired
	private ShowService showService;

	public ShowController() {
	}

	@RequestMapping(value = "/listShowsByMovie/{movieId}", method = RequestMethod.GET)
	public List<ShowResponse> listShowsByMovie(@PathVariable("movieId") int movieId) {
		List<Show> shows = this.showService.listShowsByMovie(movieId);

		return ShowConverter.convertShowModelsToResponses(shows);
	}
}
