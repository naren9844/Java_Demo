package com.org.exception;

/*
 * This is a custom exception or user defined exception 
 * used to throw the exception of type and message given by the user
 */
public class NoBonusException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoBonusException(String message) {
	
		super(message);
	}

}
