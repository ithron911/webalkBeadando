package hu.iit.uni.miskolc.nemeth.webdev.dao.exception;

public class InvalidSeatException extends Exception {

	private static final long serialVersionUID = -8961175022959969628L;

	public InvalidSeatException() {
		super();
	}

	public InvalidSeatException(
		String message,
		Throwable cause,
		boolean enableSuppression,
		boolean writableStackTrace
	) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidSeatException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidSeatException(String message) {
		super(message);
	}

	public InvalidSeatException(Throwable cause) {
		super(cause);
	}
}
