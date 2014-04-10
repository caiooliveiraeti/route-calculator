package br.eti.caiooliveira.route.calculator.service;

public class AddressServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AddressServiceException() {
		super();
	}

	public AddressServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public AddressServiceException(String message) {
		super(message);
	}

	public AddressServiceException(Throwable cause) {
		super(cause);
	}

}
