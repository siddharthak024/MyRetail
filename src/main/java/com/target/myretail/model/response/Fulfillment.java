package com.target.myretail.model.response;

public class Fulfillment {
	private String is_po_box_prohibited;

	private String po_box_prohibited_message;

	public String getIs_po_box_prohibited() {
		return is_po_box_prohibited;
	}

	public void setIs_po_box_prohibited(String is_po_box_prohibited) {
		this.is_po_box_prohibited = is_po_box_prohibited;
	}

	public String getPo_box_prohibited_message() {
		return po_box_prohibited_message;
	}

	public void setPo_box_prohibited_message(String po_box_prohibited_message) {
		this.po_box_prohibited_message = po_box_prohibited_message;
	}

	@Override
	public String toString() {
		return "ClassPojo [is_po_box_prohibited = " + is_po_box_prohibited + ", po_box_prohibited_message = "
				+ po_box_prohibited_message + "]";
	}
}