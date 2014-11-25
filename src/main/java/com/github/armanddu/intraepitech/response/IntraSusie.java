package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * { "title":"Semaine actuelle - Gabrielle", "creneau_link":"\/planning\/2159\/23147\/",
 * "timeline_start":"05\/11\/2014, 17h00", "timeline_barre":"0.0000", "timeline_end":"05\/11\/2014,
 * 19h00", "salle":"Gabrielle", "intervenant":"romero_g", "etat":"inscrit", "type":"fun" }
 */
public class IntraSusie {

  private String title;
  @SerializedName("creneau_link")
  private String creneauLink;
  @SerializedName("timeline_start")
  private String timelineStart;
  @SerializedName("timeline_end")
  private String timelineEnd;
  @SerializedName("timeline_barre")
  private String timelineBarre;
  @SerializedName("salle")
  private String room;
  private String intervenant;
  @SerializedName("etat")
  private String state;
  private String type;

  public String getTitle() {
    return title;
  }

  public double getTimelineBarre() {
    return "false".equals(timelineBarre) ? 0.0 : Double.valueOf(timelineBarre);
  }

  public String getCreneauLink() {
    return creneauLink;
  }

  public String getTimelineStart() {
    return timelineStart;
  }

  public String getTimelineEnd() {
    return timelineEnd;
  }

  public String getRoom() {
    return room;
  }

  public String getIntervenant() {
    return intervenant;
  }

  public String getState() {
    return state;
  }

  public String getType() {
    return type;
  }


}
