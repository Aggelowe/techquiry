package com.aggelowe.techquiry.data.users;

import com.aggelowe.techquiry.exception.InvalidConstructionException;

/**
 * The {@link User} class represents a user of the TechQuiry application along
 * with the respective information and data.
 * 
 * @author Aggelowe
 * @since 0.0.1
 */
public class User {

	/**
	 * The unique id of the user
	 */
	private final int id;

	/**
	 * The unique username chosen by the user
	 */
	private String username;

	/**
	 * The hashed password of the user
	 */
	private byte[] passwordHash;

	/**
	 * The random salt used in hashing the password
	 */
	private byte[] passwordSalt;

	/**
	 * The display name chosen by the user
	 */
	private String displayName;

	/**
	 * This constructor constructs a new {@link User} instance with the provided
	 * parameters as the required user information.
	 * 
	 * @param id           The unique user id
	 * @param username     The unique username
	 * @param passwordHash The hash of the user's password
	 * @param passwordSalt The salt used in the password hash
	 */
	User(int id, String username, byte[] passwordHash, byte[] passwordSalt) {
		if (username == null || passwordHash == null || passwordSalt == null) {
			throw new InvalidConstructionException("The provided user information should not be NULL!");
		}
		this.id = id;
		this.username = username;
		this.passwordHash = passwordHash;
		this.passwordSalt = passwordSalt;
	}

	/**
	 * This method returns the unique if of the user
	 * 
	 * @return The user's id
	 */
	public int getId() {
		return id;
	}

	/**
	 * This method returns the unique username of the user
	 * 
	 * @return The user's username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method returns the hashed password of the user
	 * 
	 * @return The user's password hash
	 */
	public byte[] getPasswordHash() {
		return passwordHash;
	}

	/**
	 * This method returns the salt used in the password hash of the user
	 * 
	 * @return The user password's salt
	 */
	public byte[] getPasswordSalt() {
		return passwordSalt;
	}

	/**
	 * This method returns the display name chosen by the user
	 * 
	 * @return The user's display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * This method sets the username of the user
	 * 
	 * @param username The user's username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method sets the hashed password of the user
	 * 
	 * @param passwordHash The user's password hash
	 */
	public void setPasswordHash(byte[] passwordHash) {
		this.passwordHash = passwordHash;
	}

	/**
	 * This method sets the salt used in the password hash of the user
	 * 
	 * @param passwordSalt The user password's salt
	 */
	public void setPasswordSalt(byte[] passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	/**
	 * This method returns the user's display name
	 * 
	 * @param displayName The user's display name
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}