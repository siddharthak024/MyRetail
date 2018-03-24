package com.target.myretail.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentPrice {
	@JsonProperty("value")
	private String currencyValue;
	@JsonProperty("currency_code")
	private String currencyCode;
	public String getCurrencyValue() {
		return currencyValue;
	}
	public void setCurrencyValue(String currencyValue) {
		this.currencyValue = currencyValue;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}
