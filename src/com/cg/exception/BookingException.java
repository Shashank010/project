package com.cg.exception;

public class BookingException extends Exception {
	
	
	String message;

	public BookingException(String message) {
		
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
