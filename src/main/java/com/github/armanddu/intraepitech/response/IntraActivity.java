package com.github.armanddu.intraepitech.response;

/*
 {
 "title":"[Stras'Up] Conf\u00e9rence \"Cr\u00e9er son entreprise\"",
 "module":"S0 - Conf\u00e9rences",
 "module_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/",
 "module_code":"G-EPI-007",
 "title_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/acti-172512\/",
 "timeline_start":"03\/11\/2014, 08h30",
 "timeline_end":"03\/11\/2014, 10h30",
 "timeline_barre":"0.0000",
 "date_inscription":false,
 "salle":"Salle IONIS",
 "intervenant":"cruzol_t",
 "token":null,
 "token_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/acti-172512\/event-169737\/token",
 "register_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/acti-172512\/event-169737\/register"
 }
 */

public class IntraActivity {

	private String	title;
	private String	module;
	private String	module_link;
	private String	module_code;
	private String	title_link;
	private String	timeline_start;
	private String	timeline_end;
	private String	timeline_barre;
	private boolean	date_inscription;
	private String	salle;
	private String	intervenant;
	private String	token;
	private String	token_link;
	private String	register_link;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getModule_link() {
		return module_link;
	}

	public void setModule_link(String module_link) {
		this.module_link = module_link;
	}

	public String getModule_code() {
		return module_code;
	}

	public void setModule_code(String module_code) {
		this.module_code = module_code;
	}

	public String getTitle_link() {
		return title_link;
	}

	public void setTitle_link(String title_link) {
		this.title_link = title_link;
	}

	public String getTimeline_start() {
		return timeline_start;
	}

	public void setTimeline_start(String timeline_start) {
		this.timeline_start = timeline_start;
	}

	public String getTimeline_end() {
		return timeline_end;
	}

	public void setTimeline_end(String timeline_end) {
		this.timeline_end = timeline_end;
	}

	public Number getTimeline_barre() {
		return Double.valueOf(timeline_barre);
	}

	public void setTimeline_barre(Number timeline_barre) {
		this.timeline_barre = timeline_barre.toString();
	}

	public boolean isDate_inscription() {
		return date_inscription;
	}

	public void setDate_inscription(boolean date_inscription) {
		this.date_inscription = date_inscription;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(String intervenant) {
		this.intervenant = intervenant;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken_link() {
		return token_link;
	}

	public void setToken_link(String token_link) {
		this.token_link = token_link;
	}

	public String getRegister_link() {
		return register_link;
	}

	public void setRegister_link(String register_link) {
		this.register_link = register_link;
	}

}
