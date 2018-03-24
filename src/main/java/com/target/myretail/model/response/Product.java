package com.target.myretail.model.response;

public class Product {
	private Price price;

	private Item item;

	private Promotion promotion;

	private Deep_red_labels deep_red_labels;

	private Available_to_promise_network available_to_promise_network;

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Deep_red_labels getDeep_red_labels() {
		return deep_red_labels;
	}

	public void setDeep_red_labels(Deep_red_labels deep_red_labels) {
		this.deep_red_labels = deep_red_labels;
	}

	public Available_to_promise_network getAvailable_to_promise_network() {
		return available_to_promise_network;
	}

	public void setAvailable_to_promise_network(Available_to_promise_network available_to_promise_network) {
		this.available_to_promise_network = available_to_promise_network;
	}

	@Override
	public String toString() {
		return "ClassPojo [price = " + price + ", item = " + item + ", promotion = " + promotion
				+ ", deep_red_labels = " + deep_red_labels + ", available_to_promise_network = "
				+ available_to_promise_network + "]";
	}
}
