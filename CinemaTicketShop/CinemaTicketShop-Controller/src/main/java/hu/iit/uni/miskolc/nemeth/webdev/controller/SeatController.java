package hu.iit.uni.miskolc.nemeth.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.model.Seat;
import hu.iit.uni.miskolc.nemeth.webdev.service.SeatService;

@RestController
@RequestMapping(value = "/seats")
public class SeatController {

	@Autowired
	private SeatService seatService;

	public SeatController() {
	}

	@RequestMapping(value = "/listSeatsByShow/{showId}", method = RequestMethod.GET)
	public List<Seat> listSeatsByShowId(@PathVariable("showId") int showId){
		return this.seatService.listSeatsByShow(showId);
	}
}
