package com.target.myretail.rest;

public class ErrorResponse {
	private String code;
	private String errorText;
	private String developerText;

	public ErrorResponse(String code, String errorText, String developerText) {
		this.code = code;
		this.errorText = errorText;
		this.developerText = developerText;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String getDeveloperText() {
		return developerText;
	}

	public void setDeveloperText(String developerText) {
		this.developerText = developerText;
	}

}
