package com.exceptionHandler.exceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerRepository {
	@ExceptionHandler(value = { ApiException.class })
	public ResponseEntity<Object> ExceptionHandlerRepository(ApiException e) {
		ApiException apiException = new ApiException(e.getMessage(), e, HttpStatus.BAD_REQUEST,
				ZonedDateTime.now(ZoneId.of("Z")));
		return new ResponseEntity<Object>(apiException, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { PageNotFoundException.class, NoMethodFoundException.class })
	public ResponseEntity<Object> ExceptionHandlerRepository(Exception ex) {
		ResponseEntity<Object> responseObj = null;
		if (ex instanceof PageNotFoundException) {
			PageNotFoundException notFound = new PageNotFoundException(ex.getMessage(), HttpStatus.BAD_REQUEST,
					ZonedDateTime.now(ZoneId.of("Z")));
			responseObj = new ResponseEntity<Object>(notFound, HttpStatus.NOT_FOUND);
		} else if (ex instanceof NoMethodFoundException) {
			NoMethodFoundException notFound = new NoMethodFoundException(ex.getMessage());
			responseObj = new ResponseEntity<Object>(notFound, HttpStatus.NOT_FOUND);
		}
		return responseObj;
	}
}
