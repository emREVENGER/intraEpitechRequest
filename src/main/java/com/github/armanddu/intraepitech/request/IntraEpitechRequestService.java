package com.github.armanddu.intraepitech.request;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

import com.google.gson.JsonObject;

public interface IntraEpitechRequestService {
	@FormUrlEncoded
	@POST("/?format=json")
	JsonObject connect(@Field("login") String login,
			@Field("password") String password);
	@FormUrlEncoded
	@POST("/?format=json")
	void connect(@Field("login") String login,
			@Field("password") String password, Callback<JsonObject> callback);

	@GET("/{service}?format=json")
	JsonObject getService(@Path("service") String Service);
	@GET("/{service}?format=json")
	void getService(@Path("service") String Service, Callback<JsonObject> callback);

	@FormUrlEncoded
	@POST("/{tokenUrl}?format=json")
	JsonObject postToken(@Path("tokenUrl") String tokenUrl,
			@Field("token") String token,
			@Field("note") String note,
			@Field("comment") String comment);
	@FormUrlEncoded
	@POST("/{tokenUrl}?format=json")
	void postToken(@Path("tokenUrl") String tokenUrl,
			@Field("token") String token,
			@Field("note") String note,
			@Field("comment") String comment, Callback<JsonObject> callback);

	@POST("/logout?format=json")
	JsonObject disconnect();
	@POST("/logout?format=json")
	void disconnect(Callback<JsonObject> callback);
	
}
