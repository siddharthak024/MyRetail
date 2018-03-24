package com.target.myretail.model.response;

public class Promotion {
	private String[] promotionList;

	private String subscriptionShippingMessage;

	public String[] getPromotionList() {
		return promotionList;
	}

	public void setPromotionList(String[] promotionList) {
		this.promotionList = promotionList;
	}

	public String getSubscriptionShippingMessage() {
		return subscriptionShippingMessage;
	}

	public void setSubscriptionShippingMessage(String subscriptionShippingMessage) {
		this.subscriptionShippingMessage = subscriptionShippingMessage;
	}

	@Override
	public String toString() {
		return "ClassPojo [promotionList = " + promotionList + ", subscriptionShippingMessage = "
				+ subscriptionShippingMessage + "]";
	}
}
