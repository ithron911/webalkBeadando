package hu.iit.uni.miskolc.nemeth.webdev.service.exception;

public class InvalidTicketResourcesException extends Exception {

	private static final long serialVersionUID = 4142949624066838936L;

	public InvalidTicketResourcesException() {
		super();
	}

	public InvalidTicketResourcesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidTicketResourcesException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidTicketResourcesException(String message) {
		super(message);
	}

	public InvalidTicketResourcesException(Throwable cause) {
		super(cause);
	}
}
