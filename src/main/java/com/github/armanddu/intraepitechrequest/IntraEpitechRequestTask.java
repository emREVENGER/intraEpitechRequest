package com.github.armanddu.intraepitechrequest;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONObject;

public class IntraEpitechRequestTask {

	private final String			DOMAIN	= "https://" + "intra.epitech.eu";
	public static final MediaType	JSON	= MediaType
													.parse("application/json; charset=utf-8");
	private OkHttpClient			client;
	private CookieManager			mCookieManager;

	public IntraEpitechRequestTask() {
		client = new OkHttpClient();
	}

	public String connect(String login, String password) throws IOException,
			URISyntaxException {

		JSONObject jObj = new JSONObject();
		jObj.put("login", login);
		jObj.put("password", password);
		mCookieManager = new CookieManager();
		HttpCookie cookie = new HttpCookie("language", "fr");
		cookie.setPath("/");
		cookie.setDomain(DOMAIN);
		mCookieManager.getCookieStore().add(new URI(DOMAIN), cookie);
		CookieHandler.setDefault(mCookieManager);

		return post("/", jObj);

	}

	public void disconnect() {
		CookieHandler.setDefault(null);
		mCookieManager = null;
	}

	public String get(String path) throws IOException {
		Request request = new Request.Builder().url(getUrl(path)).build();

		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	public String post(String path, JSONObject json) throws IOException {
		RequestBody body = RequestBody.create(JSON, json.toString());
		Request request = new Request.Builder().url(getUrl(path)).post(body)
				.build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}

	private String getUrl(String path) {
		return DOMAIN + path + "?format=json";
	}
}
