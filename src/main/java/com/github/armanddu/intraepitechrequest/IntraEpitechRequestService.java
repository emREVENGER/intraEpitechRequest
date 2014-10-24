package com.github.armanddu.intraepitechrequest;

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

	@GET("/{service}?format=json")
	JsonObject getService(@Path("service") String Service);

	@FormUrlEncoded
	@POST("/{tokenUrl}?format=json")
	JsonObject postToken(@Path("tokenUrl") String tokenUrl,
			@Field("token") String token,
			@Field("note") String note,
			@Field("comment") String comment);
}
