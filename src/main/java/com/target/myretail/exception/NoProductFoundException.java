package com.target.myretail.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class NoProductFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoProductFoundException(String id) {
		super("No product found : " + id);
	}
}
