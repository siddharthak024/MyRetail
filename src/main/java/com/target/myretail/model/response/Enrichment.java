package com.target.myretail.model.response;

public class Enrichment {
	private Images[] images;

	private Sales_classification_nodes[] sales_classification_nodes;

	public Images[] getImages() {
		return images;
	}

	public void setImages(Images[] images) {
		this.images = images;
	}

	public Sales_classification_nodes[] getSales_classification_nodes() {
		return sales_classification_nodes;
	}

	public void setSales_classification_nodes(Sales_classification_nodes[] sales_classification_nodes) {
		this.sales_classification_nodes = sales_classification_nodes;
	}

	@Override
	public String toString() {
		return "ClassPojo [images = " + images + ", sales_classification_nodes = " + sales_classification_nodes + "]";
	}
}
