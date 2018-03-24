package com.target.myretail.model.response;

public class Tax_category {
	private String tax_code_id;

	private String tax_code;

	private String tax_class;

	public String getTax_code_id() {
		return tax_code_id;
	}

	public void setTax_code_id(String tax_code_id) {
		this.tax_code_id = tax_code_id;
	}

	public String getTax_code() {
		return tax_code;
	}

	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}

	public String getTax_class() {
		return tax_class;
	}

	public void setTax_class(String tax_class) {
		this.tax_class = tax_class;
	}

	@Override
	public String toString() {
		return "ClassPojo [tax_code_id = " + tax_code_id + ", tax_code = " + tax_code + ", tax_class = " + tax_class
				+ "]";
	}
}