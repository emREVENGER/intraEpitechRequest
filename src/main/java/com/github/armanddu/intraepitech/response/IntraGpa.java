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

	public Number getGpa() {
		return Double.valueOf(gpa);
	}

	public void setGpa(Number gpa) {
		this.gpa = String.valueOf(gpa);
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

}
