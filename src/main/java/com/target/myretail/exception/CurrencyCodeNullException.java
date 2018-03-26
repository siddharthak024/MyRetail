package com.target.myretail.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class CurrencyCodeNullException extends RuntimeException{

	private static final long serialVersionUID = 5691915498839059806L;

	public CurrencyCodeNullException(String id) {
		super("Currency Code should not be Null for " + id);
	}
}
