package com.github.armanddu.intraepitech.request;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import com.github.armanddu.intraepitech.response.IntraEpitechResponse;
import com.github.armanddu.intraepitech.response.IntraUserResponse;
import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.RestAdapter;

//TODO create usefull classes instead of JsonObject

public class IntraEpitechRequestTask {

	private final String				DOMAIN	= "https://intra.epitech.eu";
	private CookieManager				mCookieManager;
	private IntraEpitechRequestService	mService;

	public IntraEpitechRequestTask(String domain) throws URISyntaxException {

		RestAdapter adaptater = new RestAdapter.Builder()
				.setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(DOMAIN)
				.build();

		mCookieManager = new CookieManager();
		HttpCookie cookie = new HttpCookie("language", "fr");

		cookie.setPath("/");
		cookie.setDomain(domain == null ? DOMAIN : domain);
		mCookieManager.getCookieStore().add(new URI(DOMAIN), cookie);
		CookieHandler.setDefault(mCookieManager);
		mService = adaptater.create(IntraEpitechRequestService.class);
	}

	public IntraEpitechResponse connect(String login, String password)
			throws RetrofitError {
		return mService.connect(login, password);
	}

	public void connect(String login, String password,
			Callback<IntraEpitechResponse> callback) {
		mService.connect(login, password, callback);
	}

	public IntraUserResponse getUser(String userName) throws RetrofitError {
		return mService.getUser(userName);
	}

	public void getUser(String userName, Callback<IntraUserResponse> callback)
			throws RetrofitError {
		mService.getUser(userName, callback);
	}

	public IntraEpitechResponse getServices() throws RetrofitError {
		return mService.getServices();
	}

	public void getServices(Callback<IntraEpitechResponse> callback) {
		mService.getServices(callback);
	}

	public JsonObject postToken(TokenUrl tokenUrl, String token, String note,
			String comment) throws RetrofitError {
		return mService.postToken(tokenUrl.getYear(), tokenUrl.getModuleCode(),
				tokenUrl.getSemester(), tokenUrl.getIdActivity(),
				tokenUrl.getIdEvent(), token, note, comment);
	}

	public void postToken(TokenUrl tokenUrl, String token, String note,
			String comment, Callback<JsonObject> callback) {
		mService.postToken(tokenUrl.getYear(), tokenUrl.getModuleCode(),
				tokenUrl.getSemester(), tokenUrl.getIdActivity(),
				tokenUrl.getIdEvent(), token, note, comment, callback);
	}

	public IntraEpitechResponse disconnect() throws RetrofitError {
		return mService.disconnect();
	}

	public void disconnect(Callback<IntraEpitechResponse> callback) {
		mService.disconnect(callback);
	}

}
