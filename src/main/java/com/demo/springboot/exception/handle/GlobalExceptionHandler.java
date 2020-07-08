package com.demo.springboot.exception.handle;

import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<Object> exceptionResponse(final Exception exception){
		
		logger.info(exception.getMessage());
		
		return new ResponseEntity<>("Please enter the correct URL & valid input parameter",HttpStatus.BAD_REQUEST);
		
	}
	
	  @ExceptionHandler(ConstraintViolationException.class)
	  @ResponseStatus(HttpStatus.BAD_REQUEST)
	  ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException e) {
	    return new ResponseEntity<>("not valid due to validation error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
	  }
	
	
}
