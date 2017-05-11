package hu.iit.uni.miskolc.nemeth.webdev.service.exception;

public class SeatBookedException extends Exception {

	private static final long serialVersionUID = 2715691707941300489L;

	public SeatBookedException() {
		super();
	}

	public SeatBookedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SeatBookedException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeatBookedException(String message) {
		super(message);
	}

	public SeatBookedException(Throwable cause) {
		super(cause);
	}
}
