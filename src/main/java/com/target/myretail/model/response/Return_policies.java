package com.target.myretail.model.response;

public class Return_policies {
	private String policyDays;

	private String guestMessage;

	private String user;

	public String getPolicyDays() {
		return policyDays;
	}

	public void setPolicyDays(String policyDays) {
		this.policyDays = policyDays;
	}

	public String getGuestMessage() {
		return guestMessage;
	}

	public void setGuestMessage(String guestMessage) {
		this.guestMessage = guestMessage;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ClassPojo [policyDays = " + policyDays + ", guestMessage = " + guestMessage + ", user = " + user + "]";
	}
}