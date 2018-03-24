package com.target.myretail.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyRetailResponse {
	
	private String id;
	private String name;
	@JsonProperty("current_price")
	private CurrentPrice current_price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CurrentPrice getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(CurrentPrice current_price) {
		this.current_price = current_price;
	}
	
}
