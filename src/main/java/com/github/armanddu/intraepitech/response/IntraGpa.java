package com.github.armanddu.intraepitech.response;

/*
 {
 "gpa":"3.15",
 "cycle":"bachelor"
 }
 */

public class IntraGpa {

	private String	gpa;
	private String	cycle;

	public double getGpa() {
		return Double.parseDouble(gpa);
	}

	public String getCycle() {
		return cycle;
	}

}
