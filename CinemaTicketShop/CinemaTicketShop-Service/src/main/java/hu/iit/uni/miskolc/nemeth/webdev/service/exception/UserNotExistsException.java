package hu.iit.uni.miskolc.nemeth.webdev.service.exception;

public class UserNotExistsException extends Exception {

	private static final long serialVersionUID = -6709707037032527202L;

	public UserNotExistsException() {
		super();
	}

	public UserNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserNotExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotExistsException(String message) {
		super(message);
	}

	public UserNotExistsException(Throwable cause) {
		super(cause);
	}
}
