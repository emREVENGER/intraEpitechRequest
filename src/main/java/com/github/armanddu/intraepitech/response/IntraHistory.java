package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 "title":"Cette session <a href=\"\/module\/2014\/B-PRO-480\/STG-5-1\/acti-163184\/\">QCM<\/a> de type Qcm a \u00e9t\u00e9 d\u00e9plac\u00e9e du 10\/11\/2014, 14h00 au 10\/11\/2014, 17h00",
 "user":{
 "picture":"https:\/\/cdn.local.epitech.eu\/userprofil\/brosiu_l.bmp",
 "title":"Lionel Brosius",
 "url":"\/user\/brosiu_l\/"
 },
 "content":"Pensez \u00e0 vous d\u00e9sinscrire de cette session si vous n'\u00eates pas disponible au nouvel horaire<a href=\"\/module\/2014\/B-PRO-480\/STG-5-1\/acti-163184\/event-162027\/registered\"> Voir les autres inscrits ...<\/a>",
 "date":"2014-10-31 09:08:42",
 "id":"iiiii",
 "visible":"1",
 "id_activite":"iiiii",
 "class":"planification"
 */
public class IntraHistory {
	private String			title;
	private IntraUserInfo	user;
	private String			content;
	private String			date;
	private String			id;
	private String			visible;
	@SerializedName("id_activite")
  private String idActivity;
	@SerializedName("class")
	private String			classType;

	public String getTitle() {
		return title;
	}

	public IntraUserInfo getUser() {
		return user;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public Number getId() {
		return Integer.valueOf(id);
	}

	public String getVisible() {
		return visible;
	}

	public int getIdActivity() {
		return Integer.parseInt(idActivity);
	}

	public String getClassType() {
		return classType;
	}

}
