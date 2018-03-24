package com.target.myretail.model.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Item {
	private Eligibility_rules eligibility_rules;

	private Tax_category tax_category;

	private String country_of_origin;

	private Enrichment enrichment;
	@JsonIgnore
	private String variation;

	private Package_dimensions package_dimensions;

	private Product_description product_description;
	@JsonIgnore
	private String handling;

	private String tcin;

	private Environmental_segmentation environmental_segmentation;

	private Product_classification product_classification;

	private Display_option display_option;

	private String estore_item_status_code;
	@JsonIgnore
	private String[] tags;

	private String relationship_type_code;

	private Bundle_components bundle_components;

	private String buy_url;
	@JsonIgnore
	private String[] ribbons;

	private Fulfillment fulfillment;

	private Recall_compliance recall_compliance;

	private String upc;

	private String item_state;

	private String[] specifications;

	private String parent_items;

	private String subscription_eligible;

	private String return_method;

	private String gifting_enabled;
	@JsonIgnore
	private String manufacturer;

	private Product_brand product_brand;

	private Attributes attributes;

	private Return_policies return_policies;

	private String dpci;

	public Eligibility_rules getEligibility_rules() {
		return eligibility_rules;
	}

	public void setEligibility_rules(Eligibility_rules eligibility_rules) {
		this.eligibility_rules = eligibility_rules;
	}

	public Tax_category getTax_category() {
		return tax_category;
	}

	public void setTax_category(Tax_category tax_category) {
		this.tax_category = tax_category;
	}

	public String getCountry_of_origin() {
		return country_of_origin;
	}

	public void setCountry_of_origin(String country_of_origin) {
		this.country_of_origin = country_of_origin;
	}

	public Enrichment getEnrichment() {
		return enrichment;
	}

	public void setEnrichment(Enrichment enrichment) {
		this.enrichment = enrichment;
	}

	public String getVariation() {
		return variation;
	}

	public void setVariation(String variation) {
		this.variation = variation;
	}

	public Package_dimensions getPackage_dimensions() {
		return package_dimensions;
	}

	public void setPackage_dimensions(Package_dimensions package_dimensions) {
		this.package_dimensions = package_dimensions;
	}

	public Product_description getProduct_description() {
		return product_description;
	}

	public void setProduct_description(Product_description product_description) {
		this.product_description = product_description;
	}

	public String getHandling() {
		return handling;
	}

	public void setHandling(String handling) {
		this.handling = handling;
	}

	public String getTcin() {
		return tcin;
	}

	public void setTcin(String tcin) {
		this.tcin = tcin;
	}

	public Environmental_segmentation getEnvironmental_segmentation() {
		return environmental_segmentation;
	}

	public void setEnvironmental_segmentation(Environmental_segmentation environmental_segmentation) {
		this.environmental_segmentation = environmental_segmentation;
	}

	public Product_classification getProduct_classification() {
		return product_classification;
	}

	public void setProduct_classification(Product_classification product_classification) {
		this.product_classification = product_classification;
	}

	public Display_option getDisplay_option() {
		return display_option;
	}

	public void setDisplay_option(Display_option display_option) {
		this.display_option = display_option;
	}

	public String getEstore_item_status_code() {
		return estore_item_status_code;
	}

	public void setEstore_item_status_code(String estore_item_status_code) {
		this.estore_item_status_code = estore_item_status_code;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public String getRelationship_type_code() {
		return relationship_type_code;
	}

	public void setRelationship_type_code(String relationship_type_code) {
		this.relationship_type_code = relationship_type_code;
	}

	public Bundle_components getBundle_components() {
		return bundle_components;
	}

	public void setBundle_components(Bundle_components bundle_components) {
		this.bundle_components = bundle_components;
	}

	public String getBuy_url() {
		return buy_url;
	}

	public void setBuy_url(String buy_url) {
		this.buy_url = buy_url;
	}

	public String[] getRibbons() {
		return ribbons;
	}

	public void setRibbons(String[] ribbons) {
		this.ribbons = ribbons;
	}

	public Fulfillment getFulfillment() {
		return fulfillment;
	}

	public void setFulfillment(Fulfillment fulfillment) {
		this.fulfillment = fulfillment;
	}

	public Recall_compliance getRecall_compliance() {
		return recall_compliance;
	}

	public void setRecall_compliance(Recall_compliance recall_compliance) {
		this.recall_compliance = recall_compliance;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getItem_state() {
		return item_state;
	}

	public void setItem_state(String item_state) {
		this.item_state = item_state;
	}

	public String[] getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String[] specifications) {
		this.specifications = specifications;
	}

	public String getParent_items() {
		return parent_items;
	}

	public void setParent_items(String parent_items) {
		this.parent_items = parent_items;
	}

	public String getSubscription_eligible() {
		return subscription_eligible;
	}

	public void setSubscription_eligible(String subscription_eligible) {
		this.subscription_eligible = subscription_eligible;
	}

	public String getReturn_method() {
		return return_method;
	}

	public void setReturn_method(String return_method) {
		this.return_method = return_method;
	}

	public String getGifting_enabled() {
		return gifting_enabled;
	}

	public void setGifting_enabled(String gifting_enabled) {
		this.gifting_enabled = gifting_enabled;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Product_brand getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(Product_brand product_brand) {
		this.product_brand = product_brand;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public Return_policies getReturn_policies() {
		return return_policies;
	}

	public void setReturn_policies(Return_policies return_policies) {
		this.return_policies = return_policies;
	}

	public String getDpci() {
		return dpci;
	}

	public void setDpci(String dpci) {
		this.dpci = dpci;
	}

	@Override
	public String toString() {
		return "ClassPojo [eligibility_rules = " + eligibility_rules + ", tax_category = " + tax_category
				+ ", country_of_origin = " + country_of_origin + ", enrichment = " + enrichment + ", variation = "
				+ variation + ", package_dimensions = " + package_dimensions + ", product_description = "
				+ product_description + ", handling = " + handling + ", tcin = " + tcin
				+ ", environmental_segmentation = " + environmental_segmentation + ", product_classification = "
				+ product_classification + ", display_option = " + display_option + ", estore_item_status_code = "
				+ estore_item_status_code + ", tags = " + tags + ", relationship_type_code = " + relationship_type_code
				+ ", bundle_components = " + bundle_components + ", buy_url = " + buy_url + ", ribbons = " + ribbons
				+ ", fulfillment = " + fulfillment + ", recall_compliance = " + recall_compliance + ", upc = " + upc
				+ ", item_state = " + item_state + ", specifications = " + specifications + ", parent_items = "
				+ parent_items + ", subscription_eligible = " + subscription_eligible + ", return_method = "
				+ return_method + ", gifting_enabled = " + gifting_enabled + ", manufacturer = " + manufacturer
				+ ", product_brand = " + product_brand + ", attributes = " + attributes + ", return_policies = "
				+ return_policies + ", dpci = " + dpci + "]";
	}
}
