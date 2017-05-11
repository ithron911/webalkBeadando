package hu.iit.uni.miskolc.nemeth.webdev.service.exception;

public class SeatNotExistsException extends Exception {

	private static final long serialVersionUID = -3195666955823706883L;

	public SeatNotExistsException() {
		super();
	}

	public SeatNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SeatNotExistsException(String message, Throwable cause) {
		// TODO Auto-generated constructor stub
	}

	public SeatNotExistsException(String message) {
		super(message);
	}

	public SeatNotExistsException(Throwable cause) {
		super(cause);
	}
}
