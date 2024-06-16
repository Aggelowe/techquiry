package com.aggelowe.techquiry.common.exceptions;

/**
 * {@link EnvironmentException} is an {@link ApplicationException} subclass that
 * is thrown when an environment variable is formatted invalidly.
 * 
 * @author Aggelowe
 * @since 0.0.1
 */
public class EnvironmentException extends ApplicationException {

	/**
	 * Constructs a new {@link EnvironmentException} with the given message.
	 *
	 * @param message The details message of the exception.
	 */
	public EnvironmentException(String message) {
		super(message);
	}

	/**
	 * Constructs a new {@link EnvironmentException} with the given message and
	 * cause.
	 *
	 * @param message The details message of the exception.
	 * @param cause   The <i>cause</i> of the exception.
	 */
	public EnvironmentException(String message, Throwable cause) {
		super(message, cause);
	}

	private static final long serialVersionUID = 1L;

}
