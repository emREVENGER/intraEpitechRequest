package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

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
	@SerializedName("module")
	private String	moduleName;
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

	public String getModuleName() {
		return moduleName;
	}

	public String getModule_link() {
		return module_link;
	}

	public String getModule_code() {
		return module_code;
	}

	public String getTitle_link() {
		return title_link;
	}

	public String getTimeline_start() {
		return timeline_start;
	}

	public String getTimeline_end() {
		return timeline_end;
	}

	public Number getTimeline_barre() {
		return Double.valueOf(timeline_barre);
	}

	public boolean isDate_inscription() {
		return date_inscription;
	}

	public String getSalle() {
		return salle;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public String getToken() {
		return token;
	}

	public String getToken_link() {
		return token_link;
	}

	public String getRegister_link() {
		return register_link;
	}

}
