package com.github.armanddu.intraepitech.response;

/*
 {
 "id_event_failed":"162461",
 "id_user":"48714",
 "begin":"2014-10-29 18:00:00",
 "id_activite_failed":"163182"
 }
 */

public class IntraEvent {
	private String	id_event_failed;
	private String	id_user;
	private String	begin;
	private String	id_activite_failed;

	public String getId_event_failed() {
		return id_event_failed;
	}

	public void setId_event_failed(String id_event_failed) {
		this.id_event_failed = id_event_failed;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getId_activite_failed() {
		return id_activite_failed;
	}

	public void setId_activite_failed(String id_activite_failed) {
		this.id_activite_failed = id_activite_failed;
	}

}
