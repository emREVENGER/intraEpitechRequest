package com.github.armanddu.intraepitech.response;

/*
 {
 "cycle":"bachelor",
 "gpa_average":"2.10"
 }
 */

public class IntraAverageGpa {
	private String	cycle;
	private String	gpa_average;

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public Number getGpa_average() {
		return  Float.valueOf(gpa_average);
	}

	public void setGpa_average(Number gpa_average) {
		this.gpa_average = String.valueOf(gpa_average);
	}

}
