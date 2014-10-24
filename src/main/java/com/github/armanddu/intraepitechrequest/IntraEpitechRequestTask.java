package com.github.armanddu.intraepitechrequest;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;

import com.google.gson.JsonObject;

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
		return mService.connect(login, password);
	}

	public JsonObject getService(String Service) {
		return mService.getService(Service);
	}

	public JsonObject postToken(String tokenUrl, String token, String note,
			String comment) {
		return mService.postToken(tokenUrl, token, note, comment);
	}

	public void disconnect() {
		CookieHandler.setDefault(null);
		mCookieManager = null;
	}

}
