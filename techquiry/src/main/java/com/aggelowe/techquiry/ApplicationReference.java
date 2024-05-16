package com.aggelowe.techquiry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * {@link ApplicationReference} is a class that holds constants that are
 * important for the functionality of the TechQuiry application.
 * 
 * @author Angelos Margaritis (Aggelowe)
 * @since 0.0.1
 */
public final class ApplicationReference {

	/**
	 * This constructor will throw an {@link ApplicationException} whenever invoked.
	 * {@link ApplicationReference} objects should <b>not</b> be constructible.
	 * 
	 * @throws ApplicationException Will always be thrown when the constructor is
	 *                              invoked.
	 */
	private ApplicationReference() {
		throw new ApplicationException(getClass().getName() + " objects should not be constructed!");
	}
	
	/**
	 * The string containing the name of the application
	 */
	public static final String NAME = "TechQuiry";
	
	/**
	 * The string containing the application version
	 */
	public static final String VERSION = "0.0.1";
	
	/**
	 * The logger object used by the application
	 */
	public static final Logger LOGGER;
	
	static {
		LOGGER = LogManager.getLogger(TechQuiry.class);
	}

	
}
