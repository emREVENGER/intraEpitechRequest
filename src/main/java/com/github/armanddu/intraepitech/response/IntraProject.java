package com.github.armanddu.intraepitech.response;

public class IntraProject {

	private String	title;
	private String	title_link;
	private String	timeline_start;
	private String	timeline_end;
	private String	timeline_barre;
	private String	date_inscription;
	private String	id_activite;
	private String	soutenance_name;
	private String	soutenance_link;
	private String	soutenance_date;
	private String	soutenance_salle;

	public String getTitle() {
		return title;
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

	public String getDate_inscription() {
		return date_inscription;
	}

	public Number getId_activite() {
		return Integer.valueOf(id_activite);
	}

	public String getSoutenance_name() {
		return soutenance_name;
	}

	public String getSoutenance_link() {
		return soutenance_link;
	}

	public String getSoutenance_date() {
		return soutenance_date;
	}

	public String getSoutenance_salle() {
		return soutenance_salle;
	}

}
