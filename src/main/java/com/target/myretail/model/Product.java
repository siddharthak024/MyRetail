package com.target.myretail.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
	private String productid;
	private CurrentPrice currentPrice;
	public String getProductId() {
		return productid;
	}
	public void setProductId(String productId) {
		this.productid = productId;
	}
	public CurrentPrice getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(CurrentPrice currentPrice) {
		this.currentPrice = currentPrice;
	}
	
}
