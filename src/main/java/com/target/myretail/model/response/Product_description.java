package com.target.myretail.model.response;

public class Product_description {
	private String title;

	private String general_description;

	private String[] bullet_description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGeneral_description() {
		return general_description;
	}

	public void setGeneral_description(String general_description) {
		this.general_description = general_description;
	}

	public String[] getBullet_description() {
		return bullet_description;
	}

	public void setBullet_description(String[] bullet_description) {
		this.bullet_description = bullet_description;
	}

	@Override
	public String toString() {
		return "ClassPojo [title = " + title + ", general_description = " + general_description
				+ ", bullet_description = " + bullet_description + "]";
	}
}