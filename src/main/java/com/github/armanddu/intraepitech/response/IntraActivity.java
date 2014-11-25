package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * { "title":"[Stras'Up] Conf\u00e9rence \"Cr\u00e9er son entreprise\"",
 * "module":"S0 - Conf\u00e9rences", "module_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/",
 * "module_code":"G-EPI-007", "title_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/acti-172512\/",
 * "timeline_start":"03\/11\/2014, 08h30", "timeline_end":"03\/11\/2014, 10h30",
 * "timeline_barre":"0.0000", "date_inscription":false, "salle":"Salle IONIS",
 * "intervenant":"cruzol_t", "token":null,
 * "token_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/acti-172512\/event-169737\/token",
 * "register_link":"\/module\/2014\/G-EPI-007\/STG-0-1\/acti-172512\/event-169737\/register" }
 */

public class IntraActivity {

  private String title;
  @SerializedName("module")
  private String moduleName;
  @SerializedName("module_link")
  private String moduleLink;
  @SerializedName("module_code")
  private String moduleCode;
  @SerializedName("title_link")
  private String titleLink;
  @SerializedName("timeline_start")
  private String timelineStart;
  @SerializedName("timeline_end")
  private String timelineEnd;
  @SerializedName("timeline_barre")
  private String timelineBarre;
  @SerializedName("date_inscription")
  private boolean inscriptionDate;
  @SerializedName("salle")
  private String room;
  private String intervenant;
  private String token;
  @SerializedName("token_link")
  private String tokenLink;
  @SerializedName("register_link")
  private String registerLink;

  public String getTitle() {
    return title;
  }

  public String getModuleName() {
    return moduleName;
  }

  public String getModule_link() {
    return moduleLink;
  }

  public String getModule_code() {
    return moduleCode;
  }

  public double getTimeline_barre() {
    return Double.parseDouble(timelineBarre);
  }

  public String getIntervenant() {
    return intervenant;
  }

  public String getToken() {
    return token;
  }

  public String getModuleLink() {
    return moduleLink;
  }

  public String getModuleCode() {
    return moduleCode;
  }

  public String getTitleLink() {
    return titleLink;
  }

  public String getTimelineStart() {
    return timelineStart;
  }

  public String getTimelineEnd() {
    return timelineEnd;
  }

  public String getTimelineBarre() {
    return timelineBarre;
  }

  public boolean isInscriptionDate() {
    return inscriptionDate;
  }

  public String getRoom() {
    return room;
  }

  //TODO return tokenUrl object?
  public String getTokenLink() {
    return tokenLink;
  }

  public String getRegisterLink() {
    return registerLink;
  }



}
