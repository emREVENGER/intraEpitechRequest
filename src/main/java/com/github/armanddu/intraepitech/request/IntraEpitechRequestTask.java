package com.github.armanddu.intraepitech.request;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.github.armanddu.intraepitech.response.IntraActivity;
import com.github.armanddu.intraepitech.response.IntraBoard;
import com.github.armanddu.intraepitech.response.IntraCurrentInfos;
import com.github.armanddu.intraepitech.response.IntraEpitechResponse;
import com.github.armanddu.intraepitech.response.IntraGlobalInfos;
import com.github.armanddu.intraepitech.response.IntraHistory;
import com.github.armanddu.intraepitech.response.IntraModule;
import com.github.armanddu.intraepitech.response.IntraNote;
import com.github.armanddu.intraepitech.response.IntraProject;
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

	public IntraBoard getBoard() throws RetrofitError {
		return getServices().getBoard();
	}

	public List<IntraActivity> getActivities() throws RetrofitError {
		return getBoard().getActivities();
	}

	public List<IntraProject> getProjects() throws RetrofitError {
		return getBoard().getProjects();
	}

	public List<IntraModule> getModules() throws RetrofitError {
		return getBoard().getModules();
	}

	public List<IntraNote> getNotes() throws RetrofitError {
		return getBoard().getNotes();
	}

	public ArrayList<IntraHistory> getHistory() throws RetrofitError {
		return getServices().getHistory();
	}

	public IntraGlobalInfos getInfos() throws RetrofitError {
		return getServices().getInfos();
	}

	public IntraCurrentInfos getCurrentInfos() throws RetrofitError {
		return getServices().getCurrentInfos();
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
