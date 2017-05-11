package hu.iit.uni.miskolc.nemeth.webdev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import hu.iit.uni.miskolc.nemeth.webdev.controller.model.ErrorResponse;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.InvalidTicketResourcesException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.SeatBookedException;
import hu.iit.uni.miskolc.nemeth.webdev.service.exception.UserNotExistsException;

@ControllerAdvice	
public class ExceptionHandlerController {

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidTicketResourcesException.class)
	public ErrorResponse invalidTicketResource() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage("Ticket could not be created.");
		errorResponse.setReason("One of the tickets components does not exists!");

		return errorResponse;
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(SeatBookedException.class)
	public ErrorResponse seatBooked() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage("Ticket buy failed!");
		errorResponse.setReason("The seat is already taken!");

		return errorResponse;
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UserNotExistsException.class)
	public ErrorResponse userNotExists() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage("Loading of user failed!");
		errorResponse.setReason("The user does not exists!");

		return errorResponse;
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ErrorResponse exception(Exception e) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage("Internal server error occured.");
		errorResponse.setReason(null);

		e.printStackTrace();
		return errorResponse;
	}
}
