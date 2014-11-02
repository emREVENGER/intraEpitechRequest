package com.github.armanddu.intraepitech.request;

import com.github.armanddu.intraepitech.response.IntraActivity;

public class TokenUrl {

	private String	year;
	private String	moduleCode;
	private String	semester;
	private String	idActivity;
	private String	idEvent;

	/**
	 * 
	 * @param tokenUrl
	 *            , formated like so
	 *            "/module/<year>/<module_code>/<semester>/<id_activity>/<id_event>/token"
	 */
	public TokenUrl(String tokenUrl) {
		splitTokenUrl(tokenUrl);
	}

	public TokenUrl(IntraActivity activity) {
		splitTokenUrl(activity.getToken_link());
	}

	private void splitTokenUrl(String tokenUrl) {
		String[] splitted = tokenUrl.split("/");
		year = splitted[2];
		moduleCode = splitted[3];
		semester = splitted[4];
		idActivity = splitted[5];
		idEvent = splitted[6];
	}

	public String getTokenUrl() {
		return "/module" + year + "/" + moduleCode + "/" + semester + "/"
				+ idActivity + "/" + idEvent + "/token";
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getModuleCode() {
		return moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(String idActivity) {
		this.idActivity = idActivity;
	}

	public String getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(String idEvent) {
		this.idEvent = idEvent;
	}

}
