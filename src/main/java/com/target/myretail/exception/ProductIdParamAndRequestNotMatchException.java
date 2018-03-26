package com.target.myretail.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class ProductIdParamAndRequestNotMatchException extends RuntimeException{

	private static final long serialVersionUID = 4673443148045218041L;

	public ProductIdParamAndRequestNotMatchException(String id) {
		super("Product id does not match with id in Request body: " + id);
	}
}
