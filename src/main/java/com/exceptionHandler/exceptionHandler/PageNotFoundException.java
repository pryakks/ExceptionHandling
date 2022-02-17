package com.exceptionHandler.exceptionHandler;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class PageNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	private HttpStatus httpStatus;
	private ZonedDateTime dateTime;

	public PageNotFoundException(String message, HttpStatus httpStatus, ZonedDateTime dateTime) {
		this.message = message;
		this.httpStatus = httpStatus;
		this.dateTime = dateTime;
	}

	public PageNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(ZonedDateTime dateTime) {
		this.dateTime = dateTime;
	}

}
