package com.github.armanddu.intraepitech.response;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class IntraEpitechResponse {

  private String ip;
  private IntraBoard board;
  private String message;
  private IntraGlobalInfos infos;
  @SerializedName("current")
  private IntraCurrentInfos currentInfos;
  private List<IntraHistory> history;

  public String getIp() {
    return ip;
  }

  public IntraBoard getBoard() {
    return board;
  }

  public String getMessage() {
    return message;
  }

  public IntraGlobalInfos getInfos() {
    return infos;
  }

  public IntraCurrentInfos getCurrentInfos() {
    return currentInfos;
  }

  public List<IntraHistory> getHistory() {
    return history;
  }

}
