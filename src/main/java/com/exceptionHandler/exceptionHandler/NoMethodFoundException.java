package com.exceptionHandler.exceptionHandler;

public class NoMethodFoundException extends Exception{
	private String message;

	public NoMethodFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
