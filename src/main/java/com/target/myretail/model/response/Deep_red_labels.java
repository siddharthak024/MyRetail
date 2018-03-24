package com.target.myretail.model.response;

public class Deep_red_labels {
	private Labels[] labels;

	private String total_count;

	public Labels[] getLabels() {
		return labels;
	}

	public void setLabels(Labels[] labels) {
		this.labels = labels;
	}

	public String getTotal_count() {
		return total_count;
	}

	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}

	@Override
	public String toString() {
		return "ClassPojo [labels = " + labels + ", total_count = " + total_count + "]";
	}
}