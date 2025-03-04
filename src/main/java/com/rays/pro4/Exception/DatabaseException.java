package com.rays.pro4.Exception;

/**
 * DatabaseException is propogated by Model classes when an unhandled Database
 * exception occurred.
 * 
 * @author Shivkant
 *
 */

public class DatabaseException extends Exception {

	public DatabaseException(String msg) {
		super(msg);
	}

}
