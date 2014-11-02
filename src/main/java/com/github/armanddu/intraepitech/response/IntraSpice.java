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

	public Number getConsumed_spice() {
		return consumed_spice;
	}

}
