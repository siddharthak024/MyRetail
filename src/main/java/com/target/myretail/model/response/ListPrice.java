package com.target.myretail.model.response;

public class ListPrice {
	private String price;

	private String formattedPrice;

	private String priceType;

	private String maxPrice;

	private String minPrice;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFormattedPrice() {
		return formattedPrice;
	}

	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	@Override
	public String toString() {
		return "ClassPojo [price = " + price + ", formattedPrice = " + formattedPrice + ", priceType = " + priceType
				+ ", maxPrice = " + maxPrice + ", minPrice = " + minPrice + "]";
	}
}