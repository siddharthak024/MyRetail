package com.target.myretail.model.response;

public class Display_option {
	private String is_warranty;

	private String is_size_chart;

	public String getIs_warranty() {
		return is_warranty;
	}

	public void setIs_warranty(String is_warranty) {
		this.is_warranty = is_warranty;
	}

	public String getIs_size_chart() {
		return is_size_chart;
	}

	public void setIs_size_chart(String is_size_chart) {
		this.is_size_chart = is_size_chart;
	}

	@Override
	public String toString() {
		return "ClassPojo [is_warranty = " + is_warranty + ", is_size_chart = " + is_size_chart + "]";
	}
}