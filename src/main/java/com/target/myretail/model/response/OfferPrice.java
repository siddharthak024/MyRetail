package com.target.myretail.model.response;

public class OfferPrice {
	private String startDate;

	private String price;

	private String formattedPrice;

	private String saveDollar;

	private String priceType;

	private String endDate;

	private String maxPrice;

	private String savePercent;

	private String minPrice;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

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

	public String getSaveDollar() {
		return saveDollar;
	}

	public void setSaveDollar(String saveDollar) {
		this.saveDollar = saveDollar;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getSavePercent() {
		return savePercent;
	}

	public void setSavePercent(String savePercent) {
		this.savePercent = savePercent;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	@Override
	public String toString() {
		return "ClassPojo [startDate = " + startDate + ", price = " + price + ", formattedPrice = " + formattedPrice
				+ ", saveDollar = " + saveDollar + ", priceType = " + priceType + ", endDate = " + endDate
				+ ", maxPrice = " + maxPrice + ", savePercent = " + savePercent + ", minPrice = " + minPrice + "]";
	}
}
