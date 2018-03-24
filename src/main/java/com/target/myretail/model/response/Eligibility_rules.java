package com.target.myretail.model.response;

public class Eligibility_rules {
	private Hold hold;

	private Ship_to_guest ship_to_guest;

	public Hold getHold() {
		return hold;
	}

	public void setHold(Hold hold) {
		this.hold = hold;
	}

	public Ship_to_guest getShip_to_guest() {
		return ship_to_guest;
	}

	public void setShip_to_guest(Ship_to_guest ship_to_guest) {
		this.ship_to_guest = ship_to_guest;
	}

	@Override
	public String toString() {
		return "ClassPojo [hold = " + hold + ", ship_to_guest = " + ship_to_guest + "]";
	}
}