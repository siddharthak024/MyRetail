package com.target.myretail.model;

public class MyRetailResponse {
	
	private String id;
	private String name;
	private Current_price current_price;
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
	public Current_price getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(Current_price current_price) {
		this.current_price = current_price;
	}
	
}
