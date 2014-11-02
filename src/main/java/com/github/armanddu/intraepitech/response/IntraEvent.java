package com.github.armanddu.intraepitech.response;

/*
 {
 "id_event_failed":"iiii",
 "id_user":"iii",
 "begin":"2014-10-29 18:00:00",
 "id_activite_failed":"iii"
 }
 */

public class IntraEvent {
	private String	id_event_failed;
	private String	id_user;
	private String	begin;
	private String	id_activite_failed;

	public Number getId_event_failed() {
		return Integer.valueOf(id_event_failed);
	}

	public Number getId_user() {
		return Integer.valueOf(id_user);
	}

	public String getBegin() {
		return begin;
	}

	public Number getId_activite_failed() {
		return Integer.valueOf(id_activite_failed);
	}

}
