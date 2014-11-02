package com.github.armanddu.intraepitech.response;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

//TODO user POJO

/*
 * "title":"Cette session <a href=\"\/module\/2014\/B-PRO-480\/STG-5-1\/acti-163184\/\">QCM<\/a> de type Qcm a \u00e9t\u00e9 d\u00e9plac\u00e9e du 10\/11\/2014, 14h00 au 10\/11\/2014, 17h00",
 "user":{
 "picture":"https:\/\/cdn.local.epitech.eu\/userprofil\/brosiu_l.bmp",
 "title":"Lionel Brosius",
 "url":"\/user\/brosiu_l\/"
 },
 "content":"Pensez \u00e0 vous d\u00e9sinscrire de cette session si vous n'\u00eates pas disponible au nouvel horaire<a href=\"\/module\/2014\/B-PRO-480\/STG-5-1\/acti-163184\/event-162027\/registered\"> Voir les autres inscrits ...<\/a>",
 "date":"2014-10-31 09:08:42",
 "id":"5390347",
 "visible":"1",
 "id_activite":"163184",
 "class":"planification"
 */
public class IntraHistory {
	private String		title;
	private JsonObject	user;
	private String		content;
	private String		date;
	private String		id;
	private String		visible;
	private String		id_activite;
	@SerializedName("class")
	private String		class_type;

	
	public String getClass_type() {
		return class_type;
	}

	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public JsonObject getUser() {
		return user;
	}

	public void setUser(JsonObject user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getId_activite() {
		return id_activite;
	}

	public void setId_activite(String id_active) {
		this.id_activite = id_active;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
