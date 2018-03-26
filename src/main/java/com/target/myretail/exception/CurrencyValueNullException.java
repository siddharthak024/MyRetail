package com.target.myretail.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)

public class CurrencyValueNullException extends RuntimeException{

	private static final long serialVersionUID = 2771292918632844474L;

	public CurrencyValueNullException(String id) {
		super("Currency Value should not be Null/ALPHA_NUMERIC for " + id);
	}
}
