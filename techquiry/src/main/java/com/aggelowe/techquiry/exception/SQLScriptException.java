package com.aggelowe.techquiry.exception;

/**
 * {@link SQLScriptException} is an {@link ApplicationException} subclass that
 * is thrown when a SQL script is attempted to be loaded but the operation
 * fails.
 * 
 * @author Aggelowe
 * @since 0.0.1
 */
public class SQLScriptException extends ApplicationException {

	/**
	 * Constructs a new {@link SQLScriptException} with the given message.
	 *
	 * @param message The details message of the exception.
	 */
	public SQLScriptException(String message) {
		super(message);
	}

	/**
	 * Constructs a new {@link SQLScriptException} with the given message and cause.
	 *
	 * @param message The details message of the exception.
	 * @param cause   The <i>cause</i> of the exception.
	 */
	public SQLScriptException(String message, Throwable cause) {
		super(message, cause);
	}

	private static final long serialVersionUID = 1L;

}
