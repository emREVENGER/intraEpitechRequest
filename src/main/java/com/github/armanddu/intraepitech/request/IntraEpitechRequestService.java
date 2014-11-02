package com.github.armanddu.intraepitech.request;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

import com.github.armanddu.intraepitech.response.IntraEpitechResponse;
import com.github.armanddu.intraepitech.response.IntraUserResponse;
import com.google.gson.JsonObject;

public interface IntraEpitechRequestService {
	
	@FormUrlEncoded
	@POST("/?format=json")
	IntraEpitechResponse connect(@Field("login") String login,
			@Field("password") String password);

	@FormUrlEncoded
	@POST("/?format=json")
	void connect(@Field("login") String login,
			@Field("password") String password, Callback<IntraEpitechResponse> callback);

	@GET("/?format=json")
	IntraEpitechResponse getServices();

	@GET("/?format=json")
	void getServices(Callback<IntraEpitechResponse> callback);

	@GET("/user/{username}?format=json")
	IntraUserResponse getUser(@Path("username") String userName);

	@GET("/user/{username}?format=json")
	void getUser(@Path("username") String userName,
			Callback<IntraUserResponse> callback);

	@FormUrlEncoded
	@POST("/module/{year}/{module}/{semester}/{activity}/{event}/token?format=json")
			JsonObject
			postToken(@Path("year") String year, @Path("module") String module,
					@Path("semester") String semester,
					@Path("activity") String activity,
					@Path("event") String event, @Field("token") String token,
					@Field("note") String note, @Field("comment") String comment);

	@FormUrlEncoded
	@POST("/module/{year}/{module}/{semester}/{activity}/{event}/token?format=json")
			void postToken(@Path("year") String year,
					@Path("module") String module,
					@Path("semester") String semester,
					@Path("activity") String activity,
					@Path("event") String event, @Field("token") String token,
					@Field("note") String note,
					@Field("comment") String comment,
					Callback<JsonObject> callback);

	@POST("/logout?format=json")
	IntraEpitechResponse disconnect();

	@POST("/logout?format=json")
	void disconnect(Callback<IntraEpitechResponse> callback);

}
