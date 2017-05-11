package hu.iit.uni.miskolc.nemeth.webdev.service.exception;

public class ShowNotExistsException extends Exception {

	static final long serialVersionUID = 5524249302821960909L;

	public ShowNotExistsException() {
		super();
	}

	public ShowNotExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ShowNotExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public ShowNotExistsException(String message) {
		super(message);
	}

	public ShowNotExistsException(Throwable cause) {
		super(cause);
	}
}
