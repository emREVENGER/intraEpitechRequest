package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * "title":"Exam r\u00e9seau 4", "title_link":"\/module\/2014\/B-NET-460-1\/STG-5-1\/acti-169157\/",
 * "note":"0", "noteur":"gailla_b"
 */
public class IntraNote {
  private String title;
  @SerializedName("title_link")
  private String titleLink;
  private String note;
  private String noteur;

  public String getTitle() {
    return title;
  }

  public String getTitleLink() {
    return titleLink;
  }

  public double getNote() {
    return Double.parseDouble(note);
  }

  public String getNoteur() {
    return noteur;
  }

}
