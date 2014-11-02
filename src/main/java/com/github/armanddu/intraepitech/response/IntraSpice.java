package com.github.armanddu.intraepitech.response;

/*
 "{
 "available_spice":"30",
 "consumed_spice":120
 }
 */

public class IntraSpice {

	private String	available_spice;
	private Number	consumed_spice;

	public Number getAvailable_spice() {
		return Integer.valueOf(available_spice);
	}

	public void setAvailable_spice(Number available_spice) {
		this.available_spice = available_spice.toString();
	}

	public Number getConsumed_spice() {
		return consumed_spice;
	}

	public void setConsumed_spice(Number consumed_spice) {
		this.consumed_spice = consumed_spice;
	}

}
