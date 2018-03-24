package com.target.myretail.rest;

public enum MyRetailErrorCodes {
	ID_NOT_IN_DB("101", "product id not found");
	
	private String code;
	private String text;
	
	MyRetailErrorCodes(String code, String text) {
		this.code = code;
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
