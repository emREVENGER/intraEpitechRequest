package com.github.armanddu.intraepitech;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

import com.github.armanddu.intraepitech.response.IntraEpitechResponse;

public interface AuthentificationService {

  @FormUrlEncoded
  @POST("/?format=json")
  IntraEpitechResponse connect(@Field("login") String login, @Field("password") String password);

  @FormUrlEncoded
  @POST("/?format=json")
  void connect(@Field("login") String login, @Field("password") String password,
      Callback<IntraEpitechResponse> callback);

  @POST("/logout?format=json")
  IntraEpitechResponse disconnect();

  @POST("/logout?format=json")
  void disconnect(Callback<IntraEpitechResponse> callback);

}
