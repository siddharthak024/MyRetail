package com.target.myretail.rest;

import org.springframework.http.HttpHeaders;

public final class AbstractRequestHeaders {
	private AbstractRequestHeaders() {

	}

	public static final String APPLICATION_JSON_VERSION = "application/json";
	public static final String CONTENT_TYPE = "Content-Type";

	public static HttpHeaders buildHttpHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.ACCEPT, APPLICATION_JSON_VERSION);
		headers.add(HttpHeaders.CONTENT_TYPE, CONTENT_TYPE);
		return headers;
	}
}
