package com.target.myretail.model.response;

public class Recall_compliance {
	private String is_product_recalled;

	public String getIs_product_recalled() {
		return is_product_recalled;
	}

	public void setIs_product_recalled(String is_product_recalled) {
		this.is_product_recalled = is_product_recalled;
	}

	@Override
	public String toString() {
		return "ClassPojo [is_product_recalled = " + is_product_recalled + "]";
	}
}