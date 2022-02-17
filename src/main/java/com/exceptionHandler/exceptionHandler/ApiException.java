package com.exceptionHandler.exceptionHandler;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class ApiException extends Exception{
	private String message;
	private Throwable exception;
	private HttpStatus httpStatus;
	private ZonedDateTime dateTime;

	public ApiException(String message, Throwable exception, HttpStatus httpStatus, ZonedDateTime dateTime) {
		this.message = message;
		this.exception = exception;
		this.httpStatus = httpStatus;
		this.dateTime = dateTime;
	}

	public ApiException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getException() {
		return exception;
	}

	public void setException(Throwable exception) {
		this.exception = exception;
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

	@Override
	public String toString() {
		return "ApiExceptionHandler [message=" + message + ", exception=" + exception + ", httpStatus=" + httpStatus
				+ ", dateTime=" + dateTime + "]";
	}
}
