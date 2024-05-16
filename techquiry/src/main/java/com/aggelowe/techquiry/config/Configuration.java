package com.aggelowe.techquiry.config;

import static com.aggelowe.techquiry.ApplicationReference.CONFIGURATION_FILENAME;
import static com.aggelowe.techquiry.ApplicationReference.EXECUTION_DIRECTORY;
import static com.aggelowe.techquiry.ApplicationReference.LOGGER;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;;

/**
 * The {@link Configuration} class is the one responsible for initializing and
 * handling the configuration of the TechQuiry application.
 * 
 * @author Angelos Margaritis (Aggelowe)
 * @since 0.0.1
 */
public final class Configuration {

	/**
	 * The {@link Properties} object containing the configuration entries.
	 */
	private static final Properties CONFIGURATION_ENTRIES = new Properties();

	/**
	 * This constructor will throw an {@link ConfigurationException} whenever
	 * invoked. {@link Configuration} objects should <b>not</b> be constructible.
	 * 
	 * @throws ConfigurationException Will always be thrown when the constructor is
	 *                                invoked.
	 */
	private Configuration() {
		throw new ConfigurationException(getClass().getName() + " objects should not be constructed!");
	}

	/**
	 * The {@link #initialize()} method is responsible for initializing the
	 * configuration system of the application. When invoked, the method checks for
	 * the configuration sources and loads the configuration values to the
	 * designated location.
	 */
	public static void initialize() {
		LOGGER.info("Peforming application configuration setup");
		loadConfiguration();
		applyDefaults();
	}

	/**
	 * This method loads the settings from the configuration file to
	 * {@link #CONFIGURATION_ENTRIES}, so that they can later be used by the
	 * application. If an error occurs while loading, the operation will not
	 * complete.
	 */
	private static void loadConfiguration() {
		LOGGER.debug("Loading application configuration from " + CONFIGURATION_FILENAME);
		String configurationPath = EXECUTION_DIRECTORY + "/" + CONFIGURATION_FILENAME;
		File configurationFile = new File(configurationPath);
		LOGGER.debug("Configuration file path: " + configurationFile);
		if (!configurationFile.exists()) {
			LOGGER.warn("Configuration file " + configurationFile + " not found");
			return;
		}
		if (configurationFile.isDirectory()) {
			LOGGER.error("Configuration file " + configurationFile + " is a directory");
			return;
		}
		InputStream configurationStream;
		try {
			configurationStream = new FileInputStream(configurationFile);
		} catch (FileNotFoundException exception) {
			LOGGER.error("The " + configurationFile + " file is not available to the input stream", exception);
			return;
		}
		try {
			CONFIGURATION_ENTRIES.load(configurationStream);
		} catch (IOException exception) {
			LOGGER.error("An error occured while loading the " + configurationFile + " file", exception);
		} finally {
			LOGGER.debug("Closing the configuration file input stream");
			try {
				configurationStream.close();
			} catch (IOException exception) {
				LOGGER.error("An exception occured while closing the configuration file input stream", exception);
			}
		}
	}

	/**
	 * This method applies the default values to any entry within
	 * {@link #CONFIGURATION_ENTRIES} that does not already have a value.
	 */
	private static void applyDefaults() {
		LOGGER.debug("Applying default values to missing entries");
		CONFIGURATION_ENTRIES.putIfAbsent("port", "8080");
	}

	/**
	 * This method returns the port assigned to the Spring application by the
	 * application's configuration.
	 * 
	 * @return The application's network port
	 */
	public static String getPort() {
		return CONFIGURATION_ENTRIES.getProperty("port");
	}

}
