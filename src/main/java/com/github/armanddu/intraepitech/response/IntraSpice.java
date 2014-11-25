package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * "{ "available_spice":"30", "consumed_spice":120 }
 */

public class IntraSpice {

  @SerializedName("available_spice")
  private String availableSpice;
  @SerializedName("consumed_spice")
  private int consumedSpice;

  public int getAvailableSpice() {
    return Integer.valueOf(availableSpice);
  }

  public int getConsumedSpice() {
    return consumedSpice;
  }

}
