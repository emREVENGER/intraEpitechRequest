package com.github.armanddu.intraepitech;

import retrofit.http.GET;

public interface IntraEpitechPlanningService {

  @GET("/planning?format=json&start={start}&end={end}")
  void getPlanning();
}
