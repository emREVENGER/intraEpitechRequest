package com.github.armanddu.intraepitech.response;

/*
 {
 "title":"Semaine actuelle - Gabrielle",
 "creneau_link":"\/planning\/2159\/23147\/",
 "timeline_start":"05\/11\/2014, 17h00",
 "timeline_barre":"0.0000",
 "timeline_end":"05\/11\/2014, 19h00",
 "salle":"Gabrielle",
 "intervenant":"romero_g",
 "etat":"inscrit",
 "type":"fun"
 }
 */
public class IntraSusie {

	private String	title;
	private String	creneau_link;
	private String	timeline_start;
	private String	timeline_barre;
	private String	timeline_end;
	private String	salle;
	private String	intervenant;
	private String	etat;
	private String	type;

	public String getTitle() {
		return title;
	}

	public String getCreneau_link() {
		return creneau_link;
	}

	public String getTimeline_start() {
		return timeline_start;
	}

	public Number getTimeline_barre() {
		return Double.valueOf(timeline_barre);
	}

	public String getTimeline_end() {
		return timeline_end;
	}

	public String getSalle() {
		return salle;
	}

	public String getIntervenant() {
		return intervenant;
	}

	public String getEtat() {
		return etat;
	}

	public String getType() {
		return type;
	}

}
