package hu.iit.uni.miskolc.nemeth.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.model.Cinema;
import hu.iit.uni.miskolc.nemeth.webdev.service.CinemaService;

@RestController
public class CinemaController {

	@Autowired
	private CinemaService cinemaService;

	@RequestMapping(value = "/listCinemas", method = RequestMethod.GET)
	public List<Cinema> listCinemas() {
		return this.cinemaService.getAllCinemas();
	}
}
