package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * "title":"S0 - Sport", "title_link":"\/module\/2014\/G-EPI-010\/STG-0-1\/",
 * "timeline_start":"10\/08\/2014", "timeline_end":"23\/06\/2015", "timeline_barre":"26.3197",
 * "date_inscription":"13\/01\/2015, 00h00"
 */

public class IntraModule {
  private String title;
  @SerializedName("title_link")
  private String titleLink;
  @SerializedName("timeline_start")
  private String timelineStart;
  @SerializedName("timeline_end")
  private String timelineEnd;
  @SerializedName("timeline_barre")
  private String timelineBarre;
  @SerializedName("date_inscription")
  private String inscriptionDate;

  public String getTitle() {
    return title;
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

  public Number getTimelineBarre() {
    return Double.valueOf(timelineBarre);
  }

  public String getinscriptionDate() {
    return inscriptionDate;
  }

}
