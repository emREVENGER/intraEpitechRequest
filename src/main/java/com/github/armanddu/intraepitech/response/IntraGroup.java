package com.github.armanddu.intraepitech.response;

/*
 {
 "title":"Strasbourg",
 "name":"Strasbourg",
 "count":238
 }
 */
public class IntraGroup {
	private String	title;
	private String	name;
	private Number	count;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getCount() {
		return count;
	}

	public void setCount(Number count) {
		this.count = count;
	}

}
