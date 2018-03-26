package com.target.myretail.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentPrice implements Serializable {

	private static final long serialVersionUID = -3388339498777292940L;

	@NotNull
	@JsonProperty("value")
	private Double currencyValue;

	@NotNull
	@JsonProperty("currency_code")
	private String currencyCode;
	
	public Double getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(Double currencyValue) {
		this.currencyValue = currencyValue;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
