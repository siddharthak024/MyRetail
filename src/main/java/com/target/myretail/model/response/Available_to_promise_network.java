package com.target.myretail.model.response;

public class Available_to_promise_network {
	private String stores_available_to_promise_quantity;

	private String product_id;

	private String loyalty_purchase_start_date_time;

	private String online_available_to_promise_quantity;

	private String loyalty_availability_status;

	private String[] multichannel_options;

	private String availability_status;

	private String street_date;

	private String id_type;

	private String is_infinite_inventory;

	private String is_loyalty_purchase_enabled;

	private String available_to_promise_quantity;

	private String availability;

	public String getStores_available_to_promise_quantity() {
		return stores_available_to_promise_quantity;
	}

	public void setStores_available_to_promise_quantity(String stores_available_to_promise_quantity) {
		this.stores_available_to_promise_quantity = stores_available_to_promise_quantity;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getLoyalty_purchase_start_date_time() {
		return loyalty_purchase_start_date_time;
	}

	public void setLoyalty_purchase_start_date_time(String loyalty_purchase_start_date_time) {
		this.loyalty_purchase_start_date_time = loyalty_purchase_start_date_time;
	}

	public String getOnline_available_to_promise_quantity() {
		return online_available_to_promise_quantity;
	}

	public void setOnline_available_to_promise_quantity(String online_available_to_promise_quantity) {
		this.online_available_to_promise_quantity = online_available_to_promise_quantity;
	}

	public String getLoyalty_availability_status() {
		return loyalty_availability_status;
	}

	public void setLoyalty_availability_status(String loyalty_availability_status) {
		this.loyalty_availability_status = loyalty_availability_status;
	}

	public String[] getMultichannel_options() {
		return multichannel_options;
	}

	public void setMultichannel_options(String[] multichannel_options) {
		this.multichannel_options = multichannel_options;
	}

	public String getAvailability_status() {
		return availability_status;
	}

	public void setAvailability_status(String availability_status) {
		this.availability_status = availability_status;
	}

	public String getStreet_date() {
		return street_date;
	}

	public void setStreet_date(String street_date) {
		this.street_date = street_date;
	}

	public String getId_type() {
		return id_type;
	}

	public void setId_type(String id_type) {
		this.id_type = id_type;
	}

	public String getIs_infinite_inventory() {
		return is_infinite_inventory;
	}

	public void setIs_infinite_inventory(String is_infinite_inventory) {
		this.is_infinite_inventory = is_infinite_inventory;
	}

	public String getIs_loyalty_purchase_enabled() {
		return is_loyalty_purchase_enabled;
	}

	public void setIs_loyalty_purchase_enabled(String is_loyalty_purchase_enabled) {
		this.is_loyalty_purchase_enabled = is_loyalty_purchase_enabled;
	}

	public String getAvailable_to_promise_quantity() {
		return available_to_promise_quantity;
	}

	public void setAvailable_to_promise_quantity(String available_to_promise_quantity) {
		this.available_to_promise_quantity = available_to_promise_quantity;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "ClassPojo [stores_available_to_promise_quantity = " + stores_available_to_promise_quantity
				+ ", product_id = " + product_id + ", loyalty_purchase_start_date_time = "
				+ loyalty_purchase_start_date_time + ", online_available_to_promise_quantity = "
				+ online_available_to_promise_quantity + ", loyalty_availability_status = "
				+ loyalty_availability_status + ", multichannel_options = " + multichannel_options
				+ ", availability_status = " + availability_status + ", street_date = " + street_date + ", id_type = "
				+ id_type + ", is_infinite_inventory = " + is_infinite_inventory + ", is_loyalty_purchase_enabled = "
				+ is_loyalty_purchase_enabled + ", available_to_promise_quantity = " + available_to_promise_quantity
				+ ", availability = " + availability + "]";
	}
}