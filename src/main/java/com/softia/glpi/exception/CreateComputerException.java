package com.softia.glpi.exception;

public class CreateComputerException extends Exception {
	private static final long serialVersionUID = 1L;

	public CreateComputerException(String message, Throwable cause) {
		super(message, cause);
	}

	public CreateComputerException(String message) {
		super(message);
	}

}
