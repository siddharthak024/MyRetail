package com.target.myretail.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 9070864816565245545L;

	@NotNull(message = "product id not null")
	@JsonProperty("id")
	@Field("productid")
	private String productId;

	@Transient
	@NotNull(message = "name not null")
	private String name;
	
	@NotNull(message = "current_price not null")
	@JsonProperty("current_price")
	private CurrentPrice currentPrice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public CurrentPrice getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(CurrentPrice currentPrice) {
		this.currentPrice = currentPrice;
	}

}
