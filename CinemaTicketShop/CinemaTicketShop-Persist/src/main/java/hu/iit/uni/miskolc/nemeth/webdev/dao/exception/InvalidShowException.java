package hu.iit.uni.miskolc.nemeth.webdev.dao.exception;

public class InvalidShowException extends Exception {

	private static final long serialVersionUID = -7266032281603583388L;

	public InvalidShowException() {
		super();
	}

	public InvalidShowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidShowException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidShowException(String message) {
		super(message);
	}

	public InvalidShowException(Throwable cause) {
		super(cause);
	}
}
