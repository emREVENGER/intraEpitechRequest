package com.github.armanddu.intraepitech;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

import com.github.armanddu.intraepitech.response.IntraUserResponse;

public interface UserService {

  @GET("/user/{username}?format=json")
  IntraUserResponse getUser(@Path("username") String userName);

  @GET("/user/{username}?format=json")
  void getUser(@Path("username") String userName, Callback<IntraUserResponse> callback);

}
