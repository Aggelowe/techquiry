package com.aggelowe.techquiry;

/**
 * {@link ApplicationException} is the superclass of all exceptions implemented
 * in the TechQuiry application. It extends the {@link RuntimeException} class,
 * and thus does not necessarily need to be caught.
 * 
 * @author Angelos Margaritis (Aggelowe)
 * @since 0.0.1
 */
public class ApplicationException extends RuntimeException {

	/**
	 * Constructs a new {@link ApplicationException} with the given message. The
	 * cause of the exception is set to <code>null</code>.
	 *
	 * @param message The details message of the exception.
	 */
	public ApplicationException(String message) {
		this(message, null);
	}

	/**
	 * Constructs a new {@link ApplicationException} with the given message and cause.
	 *
	 * @param message The details message of the exception.
	 * @param cause The <i>cause</i> of the exception.
	 */
	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	private static final long serialVersionUID = 1L;

}
