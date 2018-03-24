package com.target.myretail.model.response;

public class Price {
	private String mapPriceFlag;

	private ListPrice listPrice;

	private String channelAvailability;

	private OfferPrice offerPrice;

	private String partNumber;

	public String getMapPriceFlag() {
		return mapPriceFlag;
	}

	public void setMapPriceFlag(String mapPriceFlag) {
		this.mapPriceFlag = mapPriceFlag;
	}

	public ListPrice getListPrice() {
		return listPrice;
	}

	public void setListPrice(ListPrice listPrice) {
		this.listPrice = listPrice;
	}

	public String getChannelAvailability() {
		return channelAvailability;
	}

	public void setChannelAvailability(String channelAvailability) {
		this.channelAvailability = channelAvailability;
	}

	public OfferPrice getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(OfferPrice offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	@Override
	public String toString() {
		return "ClassPojo [mapPriceFlag = " + mapPriceFlag + ", listPrice = " + listPrice + ", channelAvailability = "
				+ channelAvailability + ", offerPrice = " + offerPrice + ", partNumber = " + partNumber + "]";
	}
}
