package com.github.armanddu.intraepitech;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;

import com.github.armanddu.intraepitech.request.TokenUrl;
import com.github.armanddu.intraepitech.response.IntraEpitechResponse;
import com.github.armanddu.intraepitech.response.IntraUserResponse;
import com.google.gson.JsonObject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.RestAdapter;

// TODO create usefull classes instead of JsonObject

public class IntraEpitechRequestTask {

  private final String DOMAIN = "https://intra.epitech.eu";
  private final CookieManager cookieManager;
  private final ModuleService moduleService;
  private final AuthentificationService authService;
  private final UserService userService;

  public IntraEpitechRequestTask(String domain) throws URISyntaxException {

    RestAdapter adaptater =
        new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint(DOMAIN)
            .build();

    cookieManager = new CookieManager();
    HttpCookie cookie = new HttpCookie("language", "fr");

    cookie.setPath("/");
    cookie.setDomain(domain == null ? DOMAIN : domain);
    cookieManager.getCookieStore().add(new URI(DOMAIN), cookie);
    CookieHandler.setDefault(cookieManager);
    moduleService = adaptater.create(ModuleService.class);
    authService = adaptater.create(AuthentificationService.class);
    userService = adaptater.create(UserService.class);
  }

  public IntraEpitechResponse connect(String login, String password) throws RetrofitError {
    return authService.connect(login, password);
  }

  public void connect(String login, String password, Callback<IntraEpitechResponse> callback) {
    authService.connect(login, password, callback);
  }

  public IntraUserResponse getUser(String userName) throws RetrofitError {
    return userService.getUser(userName);
  }

  public void getUser(String userName, Callback<IntraUserResponse> callback) throws RetrofitError {
    userService.getUser(userName, callback);
  }

  public IntraEpitechResponse getServices() throws RetrofitError {
    return moduleService.getServices();
  }

  public void getServices(Callback<IntraEpitechResponse> callback) {
    moduleService.getServices(callback);
  }

  public JsonObject postToken(TokenUrl tokenUrl, String token, String note, String comment)
      throws RetrofitError {
    return moduleService.postToken(tokenUrl.getYear(), tokenUrl.getModuleCode(),
        tokenUrl.getSemester(), tokenUrl.getIdActivity(), tokenUrl.getIdEvent(), token, note,
        comment);
  }

  public void postToken(TokenUrl tokenUrl, String token, String note, String comment,
      Callback<JsonObject> callback) {
    moduleService.postToken(tokenUrl.getYear(), tokenUrl.getModuleCode(), tokenUrl.getSemester(),
        tokenUrl.getIdActivity(), tokenUrl.getIdEvent(), token, note, comment, callback);
  }

  public IntraEpitechResponse disconnect() throws RetrofitError {
    return authService.disconnect();
  }

  public void disconnect(Callback<IntraEpitechResponse> callback) {
    authService.disconnect(callback);
  }

}
