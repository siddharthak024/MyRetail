package com.target.myretail.model.response;

public class Images {
	private String primary;

	private String base_url;

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public String getBase_url() {
		return base_url;
	}

	public void setBase_url(String base_url) {
		this.base_url = base_url;
	}

	@Override
	public String toString() {
		return "ClassPojo [primary = " + primary + ", base_url = " + base_url + "]";
	}
}
