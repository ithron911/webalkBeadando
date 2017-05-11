package hu.iit.uni.miskolc.nemeth.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.iit.uni.miskolc.nemeth.webdev.service.SeatService;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatNotExistsException;

@RestController
public class SeatController {

	@Autowired
	private SeatService seatService;

	public SeatController() {
	}

	@RequestMapping(value = "/bookSeat/{seatId}", method = RequestMethod.POST)
	public void bookSeat(@PathVariable("seatId") int seatId) throws SeatBookedException, SeatNotExistsException {
		this.seatService.bookSeat(seatId);
	}
}
