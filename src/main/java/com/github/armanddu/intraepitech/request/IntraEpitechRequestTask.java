package com.github.armanddu.intraepitech.request;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;

import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.RestAdapter;

public class IntraEpitechRequestTask
		implements IntraEpitechRequestService {

	private final String				DOMAIN	= "https://"
														+ "intra.epitech.eu";
	private CookieManager				mCookieManager;
	private IntraEpitechRequestService	mService;

	public IntraEpitechRequestTask() throws URISyntaxException {
		RestAdapter adaptater = new RestAdapter.Builder()
				.setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(DOMAIN)
				.build();
		mCookieManager = new CookieManager();
		HttpCookie cookie = new HttpCookie("language", "fr");

		cookie.setPath("/");
		cookie.setDomain(DOMAIN);
		mCookieManager.getCookieStore().add(new URI(DOMAIN), cookie);
		CookieHandler.setDefault(mCookieManager);
		mService = adaptater.create(IntraEpitechRequestService.class);
	}

	public JsonObject connect(String login, String password) {
		try {
			return mService.connect(login, password);
		} catch (RetrofitError e) {
			return (JsonObject) e.getBody();
		}
	}

	public JsonObject getService(String Service) {
		try {
			return mService.getService(Service);
		} catch (RetrofitError e) {
			return (JsonObject) e.getBody();
		}
	}

	public JsonObject postToken(String tokenUrl, String token, String note,
			String comment) {
		try {
			return mService.postToken(tokenUrl, token, note, comment);
		} catch (RetrofitError e) {
			return (JsonObject) e.getBody();
		}
	}

	public void disconnect() {
		CookieHandler.setDefault(null);
		mCookieManager = null;
	}

	public void connect(String login, String password,
			Callback<JsonObject> callback) {
		mService.connect(login, password, callback);
	}

	public void getService(String Service, Callback<JsonObject> callback) {
		mService.getService(Service, callback);
	}

	public void postToken(String tokenUrl, String token, String note,
			String comment, Callback<JsonObject> callback) {
		mService.postToken(tokenUrl, token, note, comment, callback);
	}
}
