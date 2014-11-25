package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 {
 "cycle":"bachelor",
 "gpa_average":"2.10"
 }
 */

public class IntraAverageGpa {
	private String	cycle;
	@SerializedName("gpa_average")
	private String	averageGpa;

	public String getCycle() {
		return cycle;
	}

	public double getAverageGpa() {
		return Double.valueOf(averageGpa);
	}

}
