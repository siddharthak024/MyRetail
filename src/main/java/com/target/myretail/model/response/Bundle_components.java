package com.target.myretail.model.response;

public class Bundle_components {
	private String is_assortment;

	private String is_standard_item;

	private String is_kit_master;

	private String is_component;

	public String getIs_assortment() {
		return is_assortment;
	}

	public void setIs_assortment(String is_assortment) {
		this.is_assortment = is_assortment;
	}

	public String getIs_standard_item() {
		return is_standard_item;
	}

	public void setIs_standard_item(String is_standard_item) {
		this.is_standard_item = is_standard_item;
	}

	public String getIs_kit_master() {
		return is_kit_master;
	}

	public void setIs_kit_master(String is_kit_master) {
		this.is_kit_master = is_kit_master;
	}

	public String getIs_component() {
		return is_component;
	}

	public void setIs_component(String is_component) {
		this.is_component = is_component;
	}

	@Override
	public String toString() {
		return "ClassPojo [is_assortment = " + is_assortment + ", is_standard_item = " + is_standard_item
				+ ", is_kit_master = " + is_kit_master + ", is_component = " + is_component + "]";
	}
}
