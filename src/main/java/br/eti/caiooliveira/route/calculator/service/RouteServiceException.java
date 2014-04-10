package br.eti.caiooliveira.route.calculator.service;

public class RouteServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RouteServiceException() {
		super();
	}

	public RouteServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public RouteServiceException(String message) {
		super(message);
	}

	public RouteServiceException(Throwable cause) {
		super(cause);
	}

}
