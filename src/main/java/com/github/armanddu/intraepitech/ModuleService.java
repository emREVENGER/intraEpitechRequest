package com.github.armanddu.intraepitech;

import retrofit.Callback;
import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

import com.github.armanddu.intraepitech.response.IntraEpitechResponse;
import com.github.armanddu.intraepitech.response.IntraModule;
import com.google.gson.JsonObject;

public interface ModuleService {

  @GET("/?format=json")
  IntraEpitechResponse getServices();

  @GET("/?format=json")
  void getServices(Callback<IntraEpitechResponse> callback);

  @GET("/module?format=json")
  void getModules(Callback<IntraModule> callback);

  @FormUrlEncoded
  @POST("/module")
  void subscribe(@Field("scolaryear") int year, @Field("codemodule") String moduleCode,
      @Field("codeinstance") String instanceCode, Callback<JsonObject> callback);

  @FormUrlEncoded
  @DELETE("/module")
  void unsubscribe(@Field("scolaryear") int year, @Field("codemodule") String moduleCode,
      @Field("codeinstance") String instanceCode, Callback<JsonObject> callback);

  @FormUrlEncoded
  @POST("/module/{year}/{module}/{semester}/{activity}/{event}/token?format=json")
  JsonObject postToken(@Path("year") String year, @Path("module") String module,
      @Path("semester") String semester, @Path("activity") String activity,
      @Path("event") String event, @Field("token") String token, @Field("note") String note,
      @Field("comment") String comment);

  @FormUrlEncoded
  @POST("/module/{year}/{module}/{semester}/{activity}/{event}/token?format=json")
  void postToken(@Path("year") String year, @Path("module") String module,
      @Path("semester") String semester, @Path("activity") String activity,
      @Path("event") String event, @Field("token") String token, @Field("note") String note,
      @Field("comment") String comment, Callback<JsonObject> callback);

}
