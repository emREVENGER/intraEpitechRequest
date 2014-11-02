package com.github.armanddu.intraepitech.response;

/*
 "title":"Exam r\u00e9seau 4",
 "title_link":"\/module\/2014\/B-NET-460-1\/STG-5-1\/acti-169157\/",
 "note":"0",
 "noteur":"gailla_b"
 */
public class IntraNote {
	private String	title;
	private String	title_link;
	private String	note;
	private String	noteur;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle_link() {
		return title_link;
	}

	public void setTitle_link(String title_link) {
		this.title_link = title_link;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNoteur() {
		return noteur;
	}

	public void setNoteur(String noteur) {
		this.noteur = noteur;
	}

}
