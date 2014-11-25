package com.github.armanddu.intraepitech.response;

import com.google.gson.annotations.SerializedName;

/*
 * { "active":30.8, "idle":0, "out_active":41.1, "out_idle":0, "nslog_norm":25 }
 */

public class IntraNsStat {
  private double active;
  private double idle;
  @SerializedName("out_active")
  private double outActive;
  @SerializedName("out_idle")
  private double outIdle;
  @SerializedName("nslog_norm")
  private double nslogNorm;

  public double getActive() {
    return active;
  }

  public double getIdle() {
    return idle;
  }

  public double getOutActive() {
    return outActive;
  }

  public double getOutIdle() {
    return outIdle;
  }

  public double getNslogNorm() {
    return nslogNorm;
  }

}
